package com.demos.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demos.entities.Schedule;

public interface ScheduleDao extends JpaRepository<Schedule, BigInteger>{

}
