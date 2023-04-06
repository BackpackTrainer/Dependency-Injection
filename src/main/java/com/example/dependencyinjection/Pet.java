package com.example.dependencyinjection;

public class Pet {
    private String petName;

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void feed()  {
        System.out.println("I like food says " + petName);
    }
}
