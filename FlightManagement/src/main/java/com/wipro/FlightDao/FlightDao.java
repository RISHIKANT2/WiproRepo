package com.wipro.FlightDao;

import java.util.List;

import com.wipro.entity.Flight;

public interface FlightDao {
  
	void saveFlightticket(Flight flight);
	List<Flight> getAllFlight();
//	Flight updateFlight(int flightNumber);
	void deleteFlight(int flightNumber);
	Flight getByFlightNumber(int flightNumber);
}
