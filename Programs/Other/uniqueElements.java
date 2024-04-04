package Other;

public class uniqueElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 1, 2, 4, 7 };
        int ans[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                ans[count++] = arr[i];
            }
        }
        System.out.print("Unique elements are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
