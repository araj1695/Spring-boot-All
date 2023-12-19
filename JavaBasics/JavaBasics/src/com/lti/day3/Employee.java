package com.lti.day3;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;

    public Employee(){

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sita", 10000);
        Employee e2 = new Employee(1, "Geeta", 10000);
        Employee e3 = new Employee(1, "Ram", 10000);
        Employee e4 = new Employee(1, "Abhishek", 10000);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println(employees);

        Collections.sort(employees);

        System.out.println(employees);

    }

    

    
    
}
