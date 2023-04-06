package com.example.dependencyinjection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControllerTester {

    @Test
    public void testingTheDefault()  {
        Controller uut = new Controller();
        String actualResult = uut.getPortNo();
        assertEquals("8090", actualResult);
    }

    @Test
    public void testingFred()  {
        Controller uut = new Controller();
        String studentName = uut.getStudentInfo();
        assertEquals("Fred", studentName);
    }
}
