package Recursion;

import java.util.Scanner;

public class fibrec {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void recursion(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            recursion(count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int count = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        recursion(count - 2);
    }

}
