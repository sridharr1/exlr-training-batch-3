import java.util.*;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Duplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}