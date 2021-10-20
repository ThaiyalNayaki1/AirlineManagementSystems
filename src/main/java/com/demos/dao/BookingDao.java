package com.demos.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.demos.entities.Booking;

public interface BookingDao  extends CrudRepository<Booking, BigInteger> {

}
