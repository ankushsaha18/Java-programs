import java.util.*;

public class maxminarray {
    public static void main(String args[]) {
        int numbers[] = { 1, 2, 9, 8, 7, 5, 6, 2, 55 };
        System.out.println("Largest number is : " + maxmin(numbers)[0]);
        System.out.println("Smallest number is : " + maxmin(numbers)[1]);

    }

    public static int[] maxmin(int numbers[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[] { max, min };
    }
}
