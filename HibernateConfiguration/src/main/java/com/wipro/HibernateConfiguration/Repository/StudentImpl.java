package com.wipro.HibernateConfiguration.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.HibernateConfiguration.Entity.Student;
import com.wipro.HibernateConfiguration.Implementation.StudentDao;



@Transactional
@Repository
public class StudentImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public void SaveStudent(Student obj) {
		// TODO Auto-generated method stub
		Session sobj = sessionFactory.getCurrentSession();
		  sobj.merge(obj);
		
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Session sobj = sessionFactory.getCurrentSession();
		String query="SELECT FROM student WHERE id=:id";
		Student studentById= sobj.createNativeQuery(query, Student.class).setParameter("id", id).getSingleResult();
		return studentById;
	
	}

	public List<Student> geAll() {
		Session sobj =  sessionFactory.getCurrentSession();
		String query = "SELECT * FROM student";
		List<Student> stdList = sobj.createNativeQuery(query, Student.class).getResultList();
		 return   stdList;
	}

	public void DeleteById(int id) {
		// TODO Auto-generated method stub
		Session sobj =  sessionFactory.getCurrentSession();
		String query="DELETE FROM student WHERE id= :id";
		 sobj.createNativeQuery(query, Student.class).setParameter("id", id).executeUpdate();
	    
	    
	}
	public void updateByName(String name,String email,String roll,String course) {
		// TODO Auto-generated method stub
		Session sobj =  sessionFactory.getCurrentSession();
		String query="SELECT * FROM student WHERE name= :name";
		Student studentById= sobj.createNativeQuery(query, Student.class).setParameter("name", name).getSingleResult();
		studentById.setEmail(email);
		studentById.setRoll(roll);
		studentById.setCourse(course);
	    sobj.merge(studentById);
	    
	}
	

}
