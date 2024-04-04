package Pattern;

public class square {
    public static void main(String[] args) {
        int rows = 8;
        for (int i = 1; i <= rows; i++) {
            System.out.print("* ");
            if (i == 1 || i == rows) {
                for (int j = 2; j <= rows - 1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 2; j <= rows - 1; j++) {
                    System.out.print("  ");
                }
            }
            System.out.println("* ");
        }
    }
}
