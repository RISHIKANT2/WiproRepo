package com.wipro.HibernateConfiguration;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.HibernateConfiguration.Entity.Employee;
import com.wipro.HibernateConfiguration.Entity.Student;
import com.wipro.HibernateConfiguration.Entity.Worker;
import com.wipro.HibernateConfiguration.Implementation.EmployeeDao;
import com.wipro.HibernateConfiguration.Implementation.StudentDao;
import com.wipro.HibernateConfiguration.Implementation.WorkerDao;
import com.wipro.HibernateConfiguration.config.HibernativeConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernativeConfig.class);
		StudentDao studentDao = context.getBean(StudentDao.class);

		
		Scanner s = new Scanner(System.in);
		
		
//		System.out.println("Enter rollno , name and email");
//		
//		int id = s.nextInt();
//		String name = s.next();
//		String email = s.next();
//		String course = s.next();
//		String roll = s.next();
//		
//		Student obj1=new Student();
//		obj1.setId(id);
//		obj1.setName(name);
//		obj1.setEmail(email);
//		obj1.setCourse(course);
//		obj1.setRoll(roll);
		
//		      studentDao.SaveStudent(obj1);
//		    Student obj2=studentDao.getStudentById(id);
//		
      
//		  List<Worker> workerList= workerDao.getAllWorker();
//		  for(Worker w:workerList) {
//			  System.out.println("Worker_id "+w.getId()+" Worker_name: "+w.getName()+" Worker_email: "+w.getWork_email()+" Worker_Salary "+w.getWorker_salary());
//		  }
//		  
//	 Worker workerById= workerDao.getWorkerById(3);
//	  System.out.println("The worker with the id: "+3+" is ");
//	  System.out.println("Worker_name: "+workerById.getName()+" Worker_email: "+workerById.getWork_email()+" Worker_salary: "+workerById.getWorker_salary());
//	workerDao.deleteWorkerById(2);
//	List<Worker> workerList= workerDao.getAllWorker();
//	  for(Worker w:workerList) {
//		  System.out.println("Worker_id "+w.getId()+" Worker_name: "+w.getName()+" Worker_email: "+w.getWork_email()+" Worker_Salary "+w.getWorker_salary());
//	  }
		
//	List<Student> stdList= studentDao.geAll();
//	for(Student std:stdList) {
//		  System.out.println("Student_id "+std.getId()+" Student_name: "+std.getName()+" Student_email: "+std.getEmail()+" Student_Course "+std.getCourse());
//	  }
//		studentDao.DeleteById(2);
//		List<Student> stdList= studentDao.geAll();
//		for(Student std:stdList) {
//			  System.out.println("Student_id "+std.getId()+" Student_name: "+std.getName()+" Student_email: "+std.getEmail()+" Student_Course "+std.getCourse());
//		  }
		studentDao.updateByName("Rishikant Pravesh", "rishi2@gmail.com", "32", "Math");
		List<Student> stdList= studentDao.geAll();
		for(Student std:stdList) {
			  System.out.println("Student_id "+std.getId()+" Student_name: "+std.getName()+" Student_email: "+std.getEmail()+" Student_Course "+std.getCourse()+" Student_Roll"+std.getRoll());
		  }
    		
	}
}
