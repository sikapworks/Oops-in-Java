package com.student;

public class Student {
    public String name;
    protected String department;
    int rollNo;
    public int age;

    static String CollegeName = "KIET";

    public Student(String name, String depart, int rollNo, int age) {
        this.name = name;
        this.department = depart;
        this.rollNo = rollNo;
        this.age = age;
    }
    public Student() {
        this.name = null;
        this.department = null;
        this.rollNo = 0;
        this.age = 0;
    }

    public void studying(int no_of_hours) {
        System.out.println("The student " + name + " is studying for " + no_of_hours + ".");
    }

    public void readAndWrite() {
        System.out.println("The student can read and write.");
    }

    public void displayInfo() {
        System.out.println("The student name is " +  name + ", age is " + age + ", roll No is " + rollNo + " and department is " + department + ".");
    }

    public static void main(String[] args) {
    }
}
