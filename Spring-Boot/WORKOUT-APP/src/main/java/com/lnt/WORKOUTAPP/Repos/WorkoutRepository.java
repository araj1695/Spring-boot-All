package com.lnt.WORKOUTAPP.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.WORKOUTAPP.Entities.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
    
}
