package com.lnt.springbootdemo.API.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findByName(String name);

    public void save(Optional<Employee> e);

}