package com.lti.day3;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2){
        return f1.color.compareTo(f2.color);
    }
    
}





