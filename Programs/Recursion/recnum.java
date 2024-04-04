package Recursion;

import java.util.*;

public class recnum {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }
}
