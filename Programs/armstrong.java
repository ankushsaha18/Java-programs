import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = in.nextInt();
        System.out.println(arms(n));
    }

    static boolean arms(int n) {
        int og = n;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += Math.pow(temp, 3);
            n /= 10;
        }
        if (sum == og) {
            return true;
        } else {
            return false;
        }
    }
}
