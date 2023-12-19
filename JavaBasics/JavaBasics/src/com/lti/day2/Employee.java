package com.lti.day2;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(){
        // No Arg constructor
    }

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }    

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    

    public static void main(String[] args){

        Employee e = new Employee(1,"Abhishek", 40000000);
        // System.out.println(e.name);
        System.out.println(e.toString());
        
        Manager m = new Manager(2,"Abhishek", 40000000, 5);
        System.out.println(m.toString());
        // System.out.println(m.toString());
    }

}
