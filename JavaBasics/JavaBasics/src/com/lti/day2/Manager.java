package com.lti.day2;

public class Manager extends Employee {

    int teamSize;

    public Manager(){
        super();
        // no arg constructor
    }

    public Manager(int id, String name, double salary, int teamSize){
        super(id,name,salary);
        this.teamSize = teamSize;
    }

    
    public String toString() {
        return "Manager [teamSize=" + teamSize + "]" + " ";
    }

    public static void main(String[] args) {
        
    }
    
}
