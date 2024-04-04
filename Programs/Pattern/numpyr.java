package Pattern;

import java.util.*;

public class numpyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:");
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
