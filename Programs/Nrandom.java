import java.util.*;

public class Nrandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        System.out.print("Enter N:");
        int N = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= N; i++) {
            int temp = rr.nextInt(1, N);
            System.out.print(temp + " ");
            if (temp % 2 == 0) {
                sum += temp;
            } else {
                product *= temp;
            }
        }
        System.out.println("\nSum of the even numbers:" + sum);
        System.out.println("Product of the odd numbers:" + product);
        if (sum % 9 == 0) {
            System.out.println("Sum of even numbers " + sum + " is divisible by 9");
        } else {
            System.out.println("Sum of even numbers " + sum + " is not divisible by 9");
        }
    }
}
