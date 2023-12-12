import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int last = 0;
        do {
            System.out.print("Enter number:");
            last = sc.nextInt();
            if (last >= max) {
                max = last;
            }
        } while (last != 0);
        System.out.println("Largest number is: " + max);
    }

}
