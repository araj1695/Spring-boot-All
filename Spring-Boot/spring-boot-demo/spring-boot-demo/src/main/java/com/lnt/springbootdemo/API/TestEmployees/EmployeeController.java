package com.lnt.springbootdemo.API.TestEmployees;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class EmployeeController {

    static List<Employee> employees = new ArrayList<>();
    
    // GET
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        // return new Employee(100, "Abhishek", 10000);
        return employees;
    }


    // POST
    @PostMapping("/employees")
    public ResponseEntity<Void> postEmployee(@RequestBody Employee e){
        ResponseEntity<Void> re = null;
        employees.add(e);
        System.out.println(e);
        re = new ResponseEntity<>(HttpStatus.CREATED);
        return re;
    }

    // PUT
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee>  updateEmployee(@PathVariable("id") int id, @RequestBody Employee e){
        ResponseEntity<Employee> re = null;
        for(Employee emp: employees){
            if(emp.id==id){
                emp.id = e.id;
                emp.name = e.name;
                emp.salary = e.salary;
                re = new ResponseEntity<>(emp,HttpStatus.CREATED);
                return re;
            }
        }
        re = new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        return re;
    }

    // DELETE
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
        ResponseEntity<String> re = null;
        for(Employee emp: employees){
            if(emp.id==id){
                employees.remove(emp);
                re = new ResponseEntity<>("Deleted the employee Successfully",HttpStatus.ACCEPTED);
                return re;
            }
        }
        re = new ResponseEntity<>("Not Deleted",HttpStatus.NOT_ACCEPTABLE);
        return re;
    }

    // PATCH   
    @PatchMapping("/employees/{id}")
    public ResponseEntity<String> updateSalaryOfEmployee(@PathVariable("id") int id, @RequestBody Employee e){
        ResponseEntity<String> re = null;
        for(Employee emp: employees){
            if(emp.id==id){
                emp.salary = e.salary;
                re = new ResponseEntity<>("Salary updated.",HttpStatus.ACCEPTED);
                return re;
            }
        }
        re = new ResponseEntity<>("Not updated",HttpStatus.NOT_ACCEPTABLE);
        return re;

    }
    
}
