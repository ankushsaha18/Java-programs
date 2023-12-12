
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums1[] = { 1, 2, 3, 4 };
        int nums2[] = { 99, 45, 101 };
        int a = nums1.length;
        int b = nums2.length;
        int[] z = new int[a + b];
        System.arraycopy(nums1, 0, z, 0, a);
        System.arraycopy(nums2, 0, z, a, b);
    }
}
