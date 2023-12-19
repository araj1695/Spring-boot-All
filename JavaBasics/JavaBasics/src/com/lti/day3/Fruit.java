package com.lti.day3;
import java.util.*;

public class Fruit implements Comparable<Fruit>{

    String name;
    String color;

    public Fruit(){}

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    };

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", color=" + color + "]";
    }

    public int compareTo(Fruit f){
        return this.name.compareTo(f.name);
    }

    public static void main(String[] args) {
        
        Fruit f2 = new Fruit("Gava", "green");
        Fruit f3 = new Fruit("Orange", "orange");
        Fruit f1 = new Fruit("Apple", "Red");
        Fruit f4 = new Fruit("papaya", "yellow");
        Fruit f5 = new Fruit("watermenlon", "Red");

        ArrayList<Fruit> fruits = new ArrayList<>();

        
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);
        fruits.add(f5);
        fruits.add(f1);
        
        // System.out.println(fruits);
        for(Fruit f:fruits){
            System.out.println(f.name);
        }

        Collections.sort(fruits);

        FruitComparator fc = new FruitComparator();
        Collections.sort(fruits, fc);

        System.out.println("============================");

        for(Fruit f:fruits){
            System.out.println(f.name);
        }

        // System.out.println(fruits);

        // System.out.println(f1);
    }

    
}
