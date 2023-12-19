package com.lnt.WORKOUTAPP.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.WORKOUTAPP.Entities.ActiveWorkout;

public interface ActiveWorkoutRepository extends JpaRepository<ActiveWorkout,Integer>{
    
}
