package com.wipro.InheritanceTypeTest.entity;

import jakarta.persistence.Entity;

@Entity
public class Boy extends Student {
  String boyClub;

public String getBoyClub() {
	return boyClub;
}

public void setBoyClub(String boyClub) {
	this.boyClub = boyClub;
}
}
