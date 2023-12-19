package com.lnt.WORKOUTAPP.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.WORKOUTAPP.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
