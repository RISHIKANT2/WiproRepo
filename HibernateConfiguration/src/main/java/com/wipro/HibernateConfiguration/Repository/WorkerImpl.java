package com.wipro.HibernateConfiguration.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.HibernateConfiguration.Entity.Employee;
import com.wipro.HibernateConfiguration.Entity.Worker;
import com.wipro.HibernateConfiguration.Implementation.WorkerDao;

import jakarta.transaction.Transactional;


@Transactional
@Repository
public class WorkerImpl implements WorkerDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveWorker(Worker worker) {
		// TODO Auto-generated method stub
		Session obj2= sessionFactory.getCurrentSession();
		obj2.merge(worker);
		
	}

	public Worker getWorkerById(int id) {
		// TODO Auto-generated method stub
		
		Session obj2= sessionFactory.getCurrentSession();
		String query="SELECT * FROM worker WHERE id= :id";
		Worker workerById=  obj2.createNativeQuery(query,Worker.class).setParameter("id", id).getSingleResult();
		return workerById;
	}

	public List<Worker> getAllWorker() {
		// TODO Auto-generated method stub
		Session obj2= sessionFactory.getCurrentSession();
		String query="SELECT * FROM worker";
		List<Worker> workerList=  obj2.createNativeQuery(query, Worker.class).list();
		return workerList;
	}

	public void deleteWorkerById(int id) {
		// TODO Auto-generated method stub
		Session obj2= sessionFactory.getCurrentSession();
		String query="DELETE FROM worker WHERE id= :id";
		obj2.createNativeQuery(query, Worker.class).setParameter("id", id).executeUpdate();
		
	}


}
