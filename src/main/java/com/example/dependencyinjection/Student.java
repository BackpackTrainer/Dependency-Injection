package com.example.dependencyinjection;

public class Student {
    private String studentName;
    private int id;
    private Pet myPet;
    private University university;

    public void setUniversity(University university) {
        this.university = university;
    }

    public void setMyPet(Pet myPet) {
        this.myPet = myPet;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Student(String name, int id)  {
        studentName = name;
        this.id = id;
    }

    public Student()  {}

    public University getUniversity() {
        return university;
    }

    public void displayStudentInfo()  {
        System.out.println("My name is: " + studentName + " and my id is " + id +".  I attend " + university.getName());
    }

    public void feedYourPet()  {
        if(myPet != null) {
            myPet.feed();
        }
    }
}
