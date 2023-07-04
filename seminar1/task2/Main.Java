package task2;

public class Main {

    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не совпадают");
            return null;
        }
    
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
    
        return result;
    }
    
}