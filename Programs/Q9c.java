public class Q9c {
    public static void main(String[] args) {
        double arr[] = { 2.5, 800.2, 45, 69.563, 445.21, 1.23, 0.0000111 };
        System.out.println(min(arr));
    }

    public static double min(double[] arr) {
        double ans = Double.MAX_VALUE;
        for (double i : arr) {
            if (i < ans) {
                ans = i;
            }
        }
        return ans;
    }
}
