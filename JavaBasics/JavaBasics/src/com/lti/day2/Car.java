package com.lti.day2;

public class Car extends Vehicle {
    boolean isAutomatic;
    boolean isSports;

    public Car(){}

    public Car(int speed, String model, String color, int gear, boolean isAutomatic, boolean isSports){
        super(speed, model, color, gear);
        this.isAutomatic = isAutomatic;
        this.isSports = isSports;
    }

    @Override
    public String toString() {
        return "Car [isAutomatic=" + isAutomatic + ", isSports=" + isSports + "]" + " "+super.toString();
    }
}
