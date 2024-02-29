
// use boolean array method for efficiency follow Q.no. FirstPosMiss41usingBarr
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
