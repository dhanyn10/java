package javaloginsecurity.loginsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javaloginsecurity.loginsystem.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
