package com.lti.day2.Bycycle;

public abstract class Bycycle implements Battery {
    int speed;
    String color;

    public Bycycle(){

    }

    public Bycycle(int speed, String color){
        this.speed = speed;
        this.color = color;
    }

    public abstract void changeGear();

    public static void main(String[] args) {
        Bycycle b = new MountainBycycle(20, "White");
        Bycycle r = new RoadBycycle(20, "red");

        b.chargeBattery();
        r.changeGear();


    }



}
