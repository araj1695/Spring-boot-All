package com.lnt.springbootdemo.API.Employees;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class EmpController {
	
	@Autowired
	EmployeeRepository employeeRepository;

    Map<Integer, Employee> employeeMap = new HashMap<>();


    // GET -> ALL
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }


    // GET -> EMPLOYEE BY ID
    @GetMapping("/employees/{id}")
    public ResponseEntity<Optional<Employee>> getAnEmployee(@PathVariable("id") int id){
        ResponseEntity<Optional<Employee>> re = null;
        Optional<Employee> e =  employeeRepository.findById(id);
        System.out.println();
        if(!e.isEmpty()){
            System.out.println("found");
             re = new ResponseEntity<>(e, HttpStatus.OK);
             return re;
        }
        else{
            re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
            return re;
        }
    }

    // GET -> ALL EMPLOYEE BY NAME
    @GetMapping("/employees/find")
    public List<Employee> getEmployeesByName(@RequestParam("name") String name){
        List<Employee> e = employeeRepository.findByName(name);
        return e;
    }


    // POST -> CREAT NEW EMPLOYEE
    @PostMapping("/employees")
    public ResponseEntity<Void> createEmployee(@RequestBody Employee employee){
        ResponseEntity<Void> re = null;
        employeeRepository.save(employee);
        re = new ResponseEntity<>(HttpStatus.CREATED);
        return re;
    }


    // DELETE -> DELETING EMPLOYEE
    @RequestMapping(path="/employees/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteEmployee(@PathVariable("id")int id){
        Optional<Employee> e = employeeRepository.findById(id);
        ResponseEntity<String> re = null;
        if(!e.isEmpty()){
             employeeRepository.deleteById(id);
             re = new ResponseEntity<>("Deletion Successfull",HttpStatus.ACCEPTED);
             return re;
        }
        return new ResponseEntity<>("Employee with EmployeeID "+id+" not found.",HttpStatus.OK);
    }
    

    // PUT -> UPDATING EMPLOYEE
    @PutMapping("/employees/{id}")
    public Optional<Employee> updateEmployee(@PathVariable("id") int id,@RequestBody Employee employee) {
        Optional<Employee> e = employeeRepository.findById(id);
        e.get().setName(employee.name);
        e.get().setSalary(employee.salary);
        employeeRepository.save(e.get());
        return e;
    }


    
}
