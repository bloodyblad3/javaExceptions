package task1;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        try {
            method1();
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: " + e.getMessage());
        }

        try {
            method2();
        } catch (NoSuchElementException e) {
            System.out.println("Caught NoSuchElementException: " + e.getMessage());
        }

        try {
            method3();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void method1() {
        int result = 10 / 0;  // ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void method2() {
        String str = null;
        int length = str.length();  // NullPointerException
        System.out.println("Length: " + length);
    }

    public static void method3() {
        int[] arr = new int[5];
        int value = arr[10];  // ArrayIndexOutOfBoundsException
        System.out.println("Value: " + value);
    }
}