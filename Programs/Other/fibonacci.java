package Other;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n = sc.nextInt();
        int a = 0, b = 1, count = 0;
        while (count < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}
