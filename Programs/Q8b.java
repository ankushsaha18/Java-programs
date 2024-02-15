public class Q8b {
    public static void main(String[] args) {
        System.out.println(checkNeon(15));
    }

    public static boolean checkNeon(int n) {
        int sqn = n * n;
        int sum = 0;
        while (sqn > 0) {
            sum += sqn % 10;
            sqn /= 10;
        }
        return (sum == n);
    }
}
