public class CountOccurenceArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 8, 2, 1, 5, 4, 1, 9 };
        occurence(arr);
    }

    public static void occurence(int arr[]) {
        int freq[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited; // it will mark that second index of that occurence as -1
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != visited) {
                System.out.println(arr[i] + " occurs: " + freq[i] + " time" + ((freq[i] == 1) ? "" : "s"));
            }
        }
    }
}
