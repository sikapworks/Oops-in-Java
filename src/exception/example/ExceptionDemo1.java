package exception.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo1 {
    public void divide() {
        int a=7; int b=0;
        int c=a/b;
    }

    public static void main(String[] args) {
        EcxeptionDemo1 ed = new EcxeptionDemo1();
        try {
            ed.divide();
        }catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        System.out.println("1");

    }
}
