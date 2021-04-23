package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student(1L, "Kanykei", 66.0, 19, "Female");
        Student student2 = new Student(2L, "Dean", 30.0, 25, "Male");
        Student student3 = new Student(3L, "Sam", 98.0, 22, "Male");
        Student student4 = new Student(4L, "Castiel", 100.0, 26, "Male");
        Student student5 = new Student(5L, "Rowena", 89.0, 30, "Female");
        Student student6 = new Student(6L, "Charlie", 75.0, 19, "Female");
        Student student7 = new Student(7L, "Jo", 50.0, 23, "Female");
        Student student8 = new Student(8L, "Crowly", 72.0, 15, "Male");
        Student student9 = new Student(9L, "Clar", 45.0, 15, "Female");
        Student student10 = new Student(10L, "Jack", 65.0, 12, "Male");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        System.out.println(students);
    }

//    public static List<String> getNamesList(Student[] students){
//
//    }
}
