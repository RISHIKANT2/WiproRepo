package com.wipro.HibernateConfiguration.Implementation;

import java.util.List;

import com.wipro.HibernateConfiguration.Entity.Employee;

public interface EmployeeDao {

	
	void saveEmployee(Employee emp);
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployee();
	void deleteEmployeeById(int id);
	int maxEmployeeeSalary();
	int minEmployeeeSalary();
	int fetchEmployeeSalaryByName(String name);
	long fetchEmployeeTotal();
}
