package com.student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("rohan", "AIML", 67, 20);
        System.out.println("The name of the student is"+s1.getName());
        RegularStudent rs= new RegularStudent("riya", "AI", 90, 19,90, "H703");
        HostelStudent hs = new HostelStudent ("Priya", "AI", 90, 19,90, "H703", "ayra", 309);
        rs.displayInfo();//parent class function
        //s1.Name="Roshni";
        s1.setName("Roshni");
        rs.payFee();
        s1.payFee();
        hs.payFee();
        System.out.println();
    }

//    public static void main(String[] args) {
//        Student student = new Student("rohan", "aiml", 67, 20);
//        System.out.println("The name of the student is "+ student.name);
//    }
}
