```java
// task 2
try {
    int d = 0;
    double catchedRes1 = intArray[8] / (double) d;
    System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
    System.out.println("Catching exception: " + e);
}

// task 3
public static void main(String[] args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[2] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
}

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
}
```