package com.wipro.DIproject;

public class Address {
 String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

//public Address(String city) {
//	this.city=city;
//}

@Override
public String toString() {
	return "Address [city=" + city + "]";
}
 
}
