package Week4.Day1;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Exercise 1: Custom Class - Student
 * Create a custom class Student with the following attributes: name (String), age (int), and grade (double).
 * Implement a Java program that uses an ArrayList to store a list of students and performs the following tasks:
 *
 * Create and add several student objects to the ArrayList.
 * Find and print the average grade of all students.
 * Print the name and age of all students who have a grade higher than 90.
 */

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }




    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        // Create and add student objects to the ArrayList
        studentList.add(new Student("Sajina", 24, 95.0));
        studentList.add(new Student("Jay", 23, 85.5));
        studentList.add(new Student("Linn", 27, 92.3));
        studentList.add(new Student("Sabina", 21, 88.7));
        studentList.add(new Student("Ambisa", 29, 98.5));

        // Find and print the average grade of all students
        double totalGrade = 0.0;
        for (Student student : studentList) {
            totalGrade += student.getGrade();
        }
        double averageGrade = totalGrade / studentList.size();
        System.out.println("Average grade of all students: " + averageGrade);

        // Print the name and age of students with grade higher than 90
        System.out.println("Students with grade higher than 90:");
        for (Student student : studentList) {
            if (student.getGrade() > 90.0) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}