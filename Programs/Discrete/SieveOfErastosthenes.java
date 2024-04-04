package Discrete;

public class SieveOfErastosthenes {
    public static void main(String[] args) {
        printPrime(23);
    }

    public static void printPrime(int n) {
        boolean arr[] = new boolean[n + 1]; // to store the nth number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
