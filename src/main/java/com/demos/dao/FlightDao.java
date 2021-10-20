package com.demos.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demos.entities.Flight;

public interface FlightDao extends JpaRepository<Flight, BigInteger>{

}
