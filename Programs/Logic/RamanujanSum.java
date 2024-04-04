package Logic;

public class RamanujanSum {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    for (int g = k + 1; g <= n; g++) {

                        int a = (int) Math.pow(i, 3);
                        int b = (int) Math.pow(k, 3);
                        int c = (int) Math.pow(j, 3);
                        int d = (int) Math.pow(g, 3);
                        if ((a + b) == (c + d)) {
                            System.out.println(a + b);
                        } else if ((a + c) == (b + d)) {
                            System.out.println(a + c);
                        } else if ((a + d) == (b + c)) {
                            System.out.println(a + d);
                        }
                    }
                }
            }
        }
    }
}
