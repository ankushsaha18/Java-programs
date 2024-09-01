package Other;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            Set<Integer> distinctElements = new HashSet<>();
            for (int i = 0; i < N; i++) {
                distinctElements.add(A[i]);
            }
            int numDistinct = distinctElements.size();
            int largestK = N - (N % numDistinct);
            System.out.println(largestK);
        }
        sc.close();
    }
}

