package Other;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
        int num = 34;
        boolean ans = true;
        for (int i = 2; i <= num / 2; i++) {
            if (checkPrime(i)) {
                if (checkPrime(num - i)) {
                    System.out.println("34 can be expressed as: " + i + "+" + (num - i));
                    ans = false;
                }
            }
        }
        if (ans)
            System.out.println(num + " cannot be expressed as sum of two prime numbers");
    }

    static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
