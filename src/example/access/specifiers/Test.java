package example.access.specifiers;

import com.student.*;

public class Test extends Student {
    public static void main(String[] args) {
        Student student = new Student("rohan", "aiml", 67, 20);
        Test test = new Test();
        System.out.println("The name of the student is " + test.getName());
    }
}
