package com.demos.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demos.entities.ScheduledFlight;

public interface ScheduledFlightDao extends JpaRepository<ScheduledFlight, BigInteger> {

}
