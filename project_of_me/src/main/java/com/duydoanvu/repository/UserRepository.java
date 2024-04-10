package com.duydoanvu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duydoanvu.models.User;



public interface UserRepository extends JpaRepository<User, Long>{
User findByUserName(String userName);
}
