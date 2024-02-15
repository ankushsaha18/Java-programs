public class Q9b {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 7, 9 };
        System.out.println(linearSearch(arr, 3));
    }

    public static boolean linearSearch(int[] arr, int element) {
        for (int i : arr) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }
}
