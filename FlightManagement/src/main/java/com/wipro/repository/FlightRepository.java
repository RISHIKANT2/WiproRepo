package com.wipro.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.FlightDao.FlightDao;
import com.wipro.entity.Flight;

@Repository
public class FlightRepository implements FlightDao{

	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveFlightticket(Flight flight) {
		// TODO Auto-generated method stub
		Session sobj= sessionFactory.getCurrentSession();
	    sobj.merge(flight);
		
	}

	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		
		Session sobj=sessionFactory.getCurrentSession();
		List<Flight> flights= sobj.createQuery("from flight",Flight.class).getResultList();
		
		return  flights;
	}

//	public Flight updateFlight(int flightNumber) {
//		// TODO Auto-generated method stub
//		Session sobj= sessionFactory.getCurrentSession();
//		
//		
//		return null;
//	}

	public void deleteFlight(int flightNumber) {
		// TODO Auto-generated method stub
		Session sobj= sessionFactory.getCurrentSession();
		Flight FlightTODelete=  getByFlightNumber(flightNumber);
		sobj.remove(FlightTODelete);
	}

	public Flight getByFlightNumber(int flightNumber) {
		// TODO Auto-generated method stub
		Session sobj= sessionFactory.getCurrentSession();
		Flight selectedFlight=  sobj.get(Flight.class, flightNumber);
		return selectedFlight;
	}

	
	
}
