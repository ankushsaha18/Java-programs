package Other;

public class occurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 1, 6, 1, 4, 66, -1, -1 };
        int index[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    index[j] = -1;
                }
            }
            if (index[i] != -1) {
                index[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (index[i] != -1) {
                System.out.println(arr[i] + " occurs " + index[i] + " time" + ((index[i] > 1) ? "s" : ""));
            }
        }
    }
}
