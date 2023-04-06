package com.example.dependencyinjection;

public class University {
    private MegaDonor richGuy;

    public MegaDonor getRichGuy() {
        return richGuy;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
