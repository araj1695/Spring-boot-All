package com.lnt.WORKOUTAPP.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.WORKOUTAPP.Entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
