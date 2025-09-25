package lab1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}
