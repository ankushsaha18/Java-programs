public class Q8c {
    public static void main(String[] args) {
        System.out.println(checkSpy(132));
    }

    public static boolean checkSpy(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return sum == product;
    }
}
