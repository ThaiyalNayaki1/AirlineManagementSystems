package com.demos.service;

import java.math.BigInteger;

import org.springframework.http.ResponseEntity;

import com.demos.entities.Flight;

public interface FlightService {

	ResponseEntity<Flight> addFlight(Flight flight);

	Iterable<Flight> viewAllFlight();

	Flight viewFlight(BigInteger flightNumber);

	Flight modifyFlight(Flight flight);
	
	String removeFlight(BigInteger flightNo);

}
