package Pattern;

public class vacantPyr {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == rows) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (i - 1) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
