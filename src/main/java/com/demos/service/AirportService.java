package com.demos.service;

import org.springframework.http.ResponseEntity;

import com.demos.entities.Airport;

public interface AirportService {

	Iterable<Airport> viewAllAirport();

	Airport viewAirport(String airportCode);

	ResponseEntity<?> addAirport(Airport airport);

	Airport modifyAirport(Airport airport);

	String removeAirport(String airportCode);

}
