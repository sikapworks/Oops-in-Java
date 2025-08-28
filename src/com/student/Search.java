//package com.student;
//
//public class Search {
//    public static class student {
//        String name;
//        int student_id;
//        double percent;
//    }
//    static void search(student s, int id) {
//        if (s.student_id == id) {
//            System.out.println("Found by ID: " + s.name + " (" + s.student_id + ")");
//        } else {
//            System.out.println("No student with ID " + id);
//        }
//    }
//    static void search(student s, String name) {
//        if (s.name.equalsIgnoreCase(name)) {
//            System.out.println("Found by Name: " + s.name + " (" + s.student_id + ")");
//        } else {
//            System.out.println("No student with name " + name);
//        }
//    }
//    static void search(student s, double percent) {
//        if (s.percent == percent) {
//            System.out.println("Found by Percent: " + s.name + " scored " + s.percent);
//        } else {
//            System.out.println("No student with percent " + percent);
//        }
//    }
////    static void search(int rollNo) {
////
////    }
////    static void search(String name, String department) {
////
////    }
////    static void search(int rollNo, String name) {
////
////    }
////    static void search(String name, int rollNo) {
////
////    }
//    public static void main(String[] args) {
//        student x = new student();
//        x.name = "Raghav";
//        x.student_id = 29;
//        x.percent = 92.5;
//
//        // Testing function overloading
//        search(x, 29);
//        search(x, "Raghav");
//        search(x, 92.5);
////        search(60);
////        search("Raya", 19);
//    }
//}
//
