import java.util.*;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter Second number:");
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

}
