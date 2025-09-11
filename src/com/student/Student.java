package com.student;

public class Student {
    private String name;
    private String department;
    private int rollNo;
    private int age;

    private static String CollegeName = "KIET";

    public Student(String name, String department, int rollNo, int age) {
        this.name = name;
        this.department = department;
        this.rollNo = rollNo;
        this.age = age;
    }

    public Student() {
        this.name = null;
        this.department = null;
        this.rollNo = 0;
        this.age = 0;
    }

    public void studying(int No_of_hours) {
        System.out.println("The student" + getName() + "is studing for" + No_of_hours);
    }

    public void readAndWrite() {
        System.out.println("the student can read and write");
    }

    public void displayInfo() {
        System.out.println("Student name is" + name + ",Age is" + age + ",RollNo is" + rollNo + "and Department is" + department);
    }

    public void payFee() {
        System.out.println("The student" + name + "paid the tution fee");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public static String getCollegeName() {
        return CollegeName;
    }

    public static void setCollegeName(String collegeName) {
        CollegeName = collegeName;
    }

}