package com.student;

public class Student {
    static String name;
    static String department;
    static int rollNo;
    static float age;

    public static void studying(int no_of_hours) {
        System.out.println("The student " + name + " is studying for " + no_of_hours + ".");
    }

    public static void readAndWrite() {
        System.out.println("The student can read and write.");
    }

    public static void displayInfo() {
        System.out.println("The student name is " +  name + ", age is " + age + ", roll no is " + rollNo + " and department is " + department + ".");
    }

    public static void main(String[] args) {
//        Student student = new Student();
        Student.studying(5);
        Student.displayInfo();
        Student.readAndWrite();
    }
}
