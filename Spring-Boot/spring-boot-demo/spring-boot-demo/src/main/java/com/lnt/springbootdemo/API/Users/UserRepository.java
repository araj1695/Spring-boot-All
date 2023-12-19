package com.lnt.springbootdemo.API.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
    List<User> findByNameIsNull();
    List<User> findByNameIsNotNull();
    List<User> findByNameIsNot(String name);
    List<User> findByNameStartingWith(String prefix);
    List<User> findByNameEndingWith(String suffix);
    List<User> findByNameContaining(String infix);

    // String likePattern = "a%b%c";
    // userRepository.findByNameLike(likePattern);
    List<User> findByNameLike(String likePattern);

    List<User> findByAgeLessThan(Integer age);
    List<User> findByAgeLessThanEqual(Integer age);
    List<User> findByAgeGreaterThan(Integer age);
    List<User> findByAgeGreaterThanEqual(Integer age);
    List<User> findByAgeBetween(Integer startAge, Integer endAge);

    List<User> findByActiveTrue();
    List<User> findByActiveFalse();
    
    List<User> OrderByName();

    List<User> OrderByAge();

    List<User> findByNameIsNotNullOrderByName();

    List<User> findByNameOrderByName(String name);
    List<User> findByNameOrderByNameAsc(String name);

    List<User> findByNameOrAge(String name, Integer age);
    List<User> findByNameOrAgeAndActive(String name, Integer age, Boolean active);
    
}
