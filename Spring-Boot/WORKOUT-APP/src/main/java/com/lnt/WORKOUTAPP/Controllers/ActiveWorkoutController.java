package com.lnt.WORKOUTAPP.Controllers;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.WORKOUTAPP.Entities.ActiveWorkout;
import com.lnt.WORKOUTAPP.Repos.ActiveWorkoutRepository;

@RestController
@RequestMapping("/api/v1")
public class ActiveWorkoutController {


    @Autowired
    ActiveWorkoutRepository activeWorkoutRepository;

    @GetMapping("/activeworkouts")
    @ResponseStatus(HttpStatus.OK)
    public List<ActiveWorkout> getActiveWorkout(){
        return activeWorkoutRepository.findAll();
    }

    @PostMapping("/activeworkouts")
    @ResponseStatus(HttpStatus.CREATED)
    public void createActiveWorkout(@RequestBody ActiveWorkout activeWorkout){
        activeWorkout.setStarTime(LocalTime.now());
        System.out.println(activeWorkout);
        activeWorkoutRepository.save(activeWorkout);
    }

    
    
}
