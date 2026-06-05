package com.wipro.HibernateConfiguration.Implementation;

import java.util.List;

import com.wipro.HibernateConfiguration.Entity.Student;

public interface StudentDao {

	void SaveStudent(Student obj);
	Student getStudentById(int id);
    List<Student> geAll();
    void DeleteById(int id);
    void updateByName(String name,String email,String roll,String course);
	
}
