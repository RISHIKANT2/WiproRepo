package com.wipro.HibernateConfiguration.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="worker")
public class Worker {

	@Id
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="work_email")
	String work_email;
	
	@Column(name="worker_salary")
	int worker_salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork_email() {
		return work_email;
	}

	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}

	public int getWorker_salary() {
		return worker_salary;
	}

	public void setWorker_salary(int worker_salary) {
		this.worker_salary = worker_salary;
	}
	
}
