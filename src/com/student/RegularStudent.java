package com.student;

public class RegularStudent extends Student {
    int attendancePer;
    String classRoom;

    public RegularStudent(String Name, String Department, int rollNo, int Age, int attendance_per, String class_room) {
        super(Name,Department,rollNo,Age );
        this.attendancePer = attendance_per;
        this.classRoom = class_room;


    }


    public RegularStudent() {

    }

    public void payFee() {
        System.out.println("the student " + getName() + " paid the tution fee+library fee+lab fee");

    }


}

