package com.example;

import java.util.ArrayList;

public class Bakery {
    private boolean isWorking;
    private ArrayList<Food> foodList;
    private Baker baker;

    public Bakery(Baker baker) {
        this.isWorking  = false;
        this.baker = baker;
        this.foodList = new ArrayList<Food>();
    }
    
}
