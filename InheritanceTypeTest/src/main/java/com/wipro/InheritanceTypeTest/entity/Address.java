package com.wipro.InheritanceTypeTest.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
  
	String city;
	String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
