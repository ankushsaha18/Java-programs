import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        int sum = n * (n + 1) / 2;
        int temp = 0;
        for (int j : arr) {
            temp += j;
        }
        System.out.println(sum - temp);
    }
}
