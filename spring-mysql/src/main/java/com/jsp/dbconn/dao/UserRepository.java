package com.jsp.dbconn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.dbconn.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findById(int id);
}
