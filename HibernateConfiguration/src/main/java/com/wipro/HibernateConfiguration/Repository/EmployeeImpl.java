package com.wipro.HibernateConfiguration.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.HibernateConfiguration.Entity.Employee;
import com.wipro.HibernateConfiguration.Implementation.EmployeeDao;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;


@Transactional
@Repository
public class EmployeeImpl implements EmployeeDao  {

	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		Session obj2= sessionFactory.getCurrentSession();
		obj2.merge(emp);
		
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		
		Session obj2= sessionFactory.getCurrentSession();
		
				
		CriteriaBuilder cb = obj2.getCriteriaBuilder();

		CriteriaQuery<Employee> cq =
		    cb.createQuery(Employee.class);

		Root<Employee> root = cq.from(Employee.class);

		cq.select(root)
		  .where(cb.equal(root.get("employee_id"), id));

		Employee empById =
		    obj2.createQuery(cq).getSingleResult();
		return empById;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		Session obj2= sessionFactory.getCurrentSession();
		
		CriteriaBuilder cb= obj2.getCriteriaBuilder();
		
		CriteriaQuery<Employee> cq= cb.createQuery(Employee.class);
		Root<Employee> root= cq.from(Employee.class);
		
		cq.select(root);
		
		
		
		return obj2.createQuery(cq).getResultList();
	}

	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Session obj2= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= obj2.getCriteriaBuilder();
		CriteriaDelete<Employee> cd= cb.createCriteriaDelete(Employee.class);
		Root<Employee> root= cd.from(Employee.class);
		
		cd.where(
			    cb.equal(root.get("id"), id)
			);

			obj2.createMutationQuery(cd).executeUpdate();
		
	}

	public int maxEmployeeeSalary() {
		// TODO Auto-generated method stub
		
		Session obj= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= obj.getCriteriaBuilder();
		
		CriteriaQuery<Integer> cq= cb.createQuery(Integer.class);
		
		Root<Employee> root= cq.from(Employee.class);
		cq.select(
			    cb.max(root.<Integer>get("emp_salary"))
			);
		int EmployeesMaxSalary =
			    obj.createQuery(cq).getSingleResult();
		return EmployeesMaxSalary;
	}

	public int minEmployeeeSalary() {
		// TODO Auto-generated method stub
		Session obj= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= obj.getCriteriaBuilder();
		
		CriteriaQuery<Integer> cq= cb.createQuery(Integer.class);
		
		Root<Employee> root= cq.from(Employee.class);
		cq.select(
			    cb.min(root.<Integer>get("emp_salary"))
			);
		int EmployeesMaxSalary =
			    obj.createQuery(cq).getSingleResult();
		return EmployeesMaxSalary;
		
	}

	public int fetchEmployeeSalaryByName(String name) {
		// TODO Auto-generated method stub
		Session obj= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= obj.getCriteriaBuilder();
		
		CriteriaQuery<Integer> cq= cb.createQuery(Integer.class);
		
		Root<Employee> root= cq.from(Employee.class);
		cq.select(root.<Integer>get("emp_salary"))
		  .where(
		      cb.equal(root.get("name"), name)
		  );
		int EmployeesSalaryByName =
			    obj.createQuery(cq).getSingleResult();
		return EmployeesSalaryByName;
		
	}

	public long fetchEmployeeTotal() {
		// TODO Auto-generated method stub
		Session obj= sessionFactory.getCurrentSession();
		CriteriaBuilder cb= obj.getCriteriaBuilder();
		
		CriteriaQuery<Long> cq= cb.createQuery(Long.class);
		
		Root<Employee> root= cq.from(Employee.class);
		
		cq.select(cb.count(root.get("name")));
		
		

		return obj.createQuery(cq).getSingleResult();
	}

	
	
}
