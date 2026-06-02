package com.wipro.InheritanceTypeTest.entity;

import jakarta.persistence.Entity;

@Entity
public class Girl extends Student{

	String girlClub;

	public String getGirlClub() {
		return girlClub;
	}

	public void setGirlClub(String girlClub) {
		this.girlClub = girlClub;
	}
}
