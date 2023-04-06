package com.example.dependencyinjection;

public class Controller implements IController{
    @Override
    public String getStudentInfo() {
        return "Fred";
    }
    public String getPortNo() {
        return "8090";
    }

    @Override
    public double someOp() {
        return 0;
    }
}
