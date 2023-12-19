package com.lti.day2.Bycycle;

public class RoadBycycle extends Bycycle {

    public RoadBycycle(){
    }

    public RoadBycycle(int speed, String color){
        super(speed, color);
    }

    public void changeGear(){
        System.out.println("Gear is changed for RoadBycycle...!");
    }

    public void chargeBattery(){
        System.out.println("Battery fully charged for MountainBycycle...!");
    }
    
}
