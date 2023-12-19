package com.lnt.WORKOUTAPP.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.WORKOUTAPP.Entities.Category;
import com.lnt.WORKOUTAPP.Entities.Workout;
import com.lnt.WORKOUTAPP.Repos.CategoryRepository;
import com.lnt.WORKOUTAPP.Repos.WorkoutRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
public class WorkoutController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    WorkoutRepository workoutRepository;

    @GetMapping("/workouts")
    public List<Workout> getAllWorkouts(){
        List<Workout> workouts = workoutRepository.findAll();
        return workouts;
    }

    @PostMapping("/workouts")
    @ResponseStatus(HttpStatus.CREATED)
    public void createWorkout(@RequestBody Workout workout) {
        int categoryId = workout.getCategory().getId();
        if(categoryId>0){
            Optional<Category> foundedCategory = categoryRepository.findById(categoryId);
            if(foundedCategory.isPresent()){
                workout.setCategory(foundedCategory.get());
            }
        }
        workoutRepository.save(workout);
    }


    @GetMapping("/category")
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }


    @PostMapping("/category")
    public void createCategory(@RequestBody Category category){
        categoryRepository.save(category);
    }
    
    
}
