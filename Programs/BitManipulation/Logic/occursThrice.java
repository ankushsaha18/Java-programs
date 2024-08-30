package BitManipulation.Logic;

public class occursThrice {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 3, 3, 5, 5, 6, 6, 5, 6 };
        System.out.println(singleOccurence(arr));
    }

    public static int singleOccurence(int arr[]) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & (1 << i)) != 0) {
                    cnt++;
                }
            }
            if (cnt % 3 == 1) {
                ans += (1 << i);
            }
        }
        return ans;
    }
}
