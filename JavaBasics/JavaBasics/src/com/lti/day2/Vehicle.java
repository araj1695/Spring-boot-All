package com.lti.day2;

public class Vehicle {

    int speed;
    String model;
    String color;
    int gear;

    public Vehicle(){

    }

    public Vehicle(int speed, String model, String color, int gear) {
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.gear = gear;
    }

    public String speedup(){
        this.speed++;
        return "Now Speed is: "+this.speed;
    }

    public String speedDown(){
        this.speed--;
        return "Now Speed is: "+this.speed;
    }

    public String changeGear(int newGear){
        this.gear = newGear;
        return "Vehicle is now on "+this.gear+" gear.";

    }
    
    @Override
    public String toString() {
        return "Vehicle [speed=" + speed + ", model=" + model + ", color=" + color + ", gear=" + gear + "]";
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(100,"A1", "red", 3);
        System.out.println(v1.toString());

        Car c1 = new Car(100,"A1", "red", 3, true, false);
        System.out.println(c1.toString());

        // implicit typecast
        // Vehicle v2 = c1;
        // System.out.println(v2.toString());


    }
}
