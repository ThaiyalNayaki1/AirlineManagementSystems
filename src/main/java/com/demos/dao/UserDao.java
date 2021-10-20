package com.demos.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demos.entities.Users;

public interface UserDao extends JpaRepository<Users, BigInteger>{

}
