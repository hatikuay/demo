package com.example;

public class Person {
    private String name;
    private boolean isAlive;

    public Person(String name) {
        this.name = name;
        this.isAlive = true;
    }

    public String getPerson() {
        return this.name;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void eat() {

    }
}
