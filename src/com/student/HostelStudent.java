package com.student;

public class HostelStudent extends
        RegularStudent {
    String hostelName;
    int roomNo;

    public HostelStudent(String Name, String Department, int rollNo, int Age, int attendancePer, String classRoom, String hostelName, int room_no) {
        super(Name, Department, rollNo, Age, attendancePer, classRoom);
        this.hostelName = hostelName;
        this.roomNo = roomNo;
    }
    public void payFee() {
        System.out.println("the student" + getName() + "paid the tuition fee + Library fee + Lab fee + hotal fee");
    }

}
