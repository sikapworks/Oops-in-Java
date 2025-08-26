package com.student;

public class RegularStudent extends Student {
    int attendance_per;
    String class_room;

    public RegularStudent(String Name, String Department, int rollNo, int Age, int attendance_per, String class_room) {
        this.attendance_per = attendance_per;
        this.class_room = class_room;


    }


    public RegularStudent() {

    }

    public void payFee() {
        System.out.println("the student " + name + " paid the tution fee+library fee+lab fee");

    }


}

