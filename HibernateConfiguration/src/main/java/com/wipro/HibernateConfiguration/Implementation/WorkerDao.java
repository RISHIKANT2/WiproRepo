package com.wipro.HibernateConfiguration.Implementation;

import java.util.List;


import com.wipro.HibernateConfiguration.Entity.Worker;

public interface WorkerDao {

	void saveWorker(Worker emp);
	Worker getWorkerById(int id);
	List<Worker> getAllWorker();
	void deleteWorkerById(int id);
}
