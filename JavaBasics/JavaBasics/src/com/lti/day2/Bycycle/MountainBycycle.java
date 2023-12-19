package com.lti.day2.Bycycle;

public class MountainBycycle extends Bycycle {


    public MountainBycycle(){
    }

    public MountainBycycle(int speed, String color){
        super(speed, color);
    }

    public void changeGear(){
        System.out.println("Gear is changed for MountainBycycle...!");
    }

    public void chargeBattery(){
        System.out.println("Battery fully charged MountainBycycle...!");
    }
    
}
