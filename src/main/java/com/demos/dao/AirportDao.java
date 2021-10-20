package com.demos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demos.entities.Airport;

@Repository
public interface AirportDao extends CrudRepository<Airport, String> {

}