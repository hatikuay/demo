package com.example;

import java.util.ArrayList;

public class City {
    private ArrayList<Person> personList;
    private Bakery bakery;

    public City(ArrayList<Person> personList, Bakery bakery){
        this.personList = personList;
        this.bakery = bakery;
    }
    
}
