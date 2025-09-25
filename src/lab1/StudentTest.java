package lab1;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    manager.addStudent(new Student(id, name, age));
                    System.out.println("Student added.");
                }
                case 2 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    boolean removed = manager.deleteStudent(id);
                    System.out.println(removed ? "Student deleted." : "Student not found.");
                }
                case 3 -> {
                    if (manager.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("\nStudent List:");
                        manager.getStudents().forEach(System.out::println);
                    }
                }
                case 4 -> {
                    System.out.println("Exiting");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

