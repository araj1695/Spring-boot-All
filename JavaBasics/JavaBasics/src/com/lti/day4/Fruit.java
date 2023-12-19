package com.lti.day4;
import java.util.*;

// Thred class for fruit
class firstLetterOfFruitTask implements Runnable{
    Fruit fruit;

    // construct
    public firstLetterOfFruitTask(Fruit f){
        this.fruit = f;
    }
    
    // Method for printing first letter
    // public void printFirstLetter(){
    //     System.out.println(this.fruit.name.charAt(0));
    // }

    @Override
    public void run(){
        this.fruit.printFirstLetter();
        System.out.println("Fruit Task is running by... "+Thread.currentThread().getName());
    }
}

public class Fruit{
    String name;
    String color;

    public Fruit(){}

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    };

    public void printFirstLetter(){
        System.out.println(this.name.charAt(0));
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", color=" + color + "]";
    }

    // Main method
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
        
        System.out.println(fruits);

        for(Fruit f: fruits){
            firstLetterOfFruitTask fruitThred = new firstLetterOfFruitTask(f);
            Thread t = new Thread(fruitThred);
            t.start();
        }
    }

    
}
