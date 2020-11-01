package com.company;

public class MathTeacher extends Teacher {
    int favoriteNumber;

    public MathTeacher(int numberOfStudents,
                       String school, int favoriteNumber) {
        //calling the constructor of the class
        //---> setting up the super class
        super(numberOfStudents, school);
        this.favoriteNumber = favoriteNumber;
    }
}
