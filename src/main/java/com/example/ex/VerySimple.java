package com.example.ex;

public class VerySimple {
    private int age;
    private static int personCount = 0;
    private String name;

    // constructor
    public VerySimple(int age, String n) {
        this.age = age;
        this.name = n;
        personCount++;
    }

    // getters
    public int getAge() {
        return age;
        //return 365;
    }

    public static int getPersonCount() {
        return personCount;
    }

    void setAge(int a) { // package private
        age = a;
    }

    // getter (with no corresponding setter)
    public String getName() {
        return name;
    }
}
