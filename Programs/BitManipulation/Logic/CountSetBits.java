package BitManipulation.Logic;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countBit(7));
    }
    public static int countBit(int n){
        int ans = 0;
        while (n != 0){
            n = n & (n-1);
            ans++;
        }
        return ans;
    }
}
