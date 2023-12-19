package com.lti.day3;

public class Branch {
    int id;
    String location;

    public Branch(int id, String location) {
        this.id = id;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Branch [id=" + id + ", location=" + location + "]";
    }
    
}
