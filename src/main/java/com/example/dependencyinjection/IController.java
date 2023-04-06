package com.example.dependencyinjection;

public interface IController {

    String getStudentInfo();

    default String getPortNo() {
        return "8080";
    }

    double someOp();
}
