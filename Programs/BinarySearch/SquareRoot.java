package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        long n = 2147395599;
        System.out.println(floorSqrt(n));
    }
    public static long floorSqrt(long n) {
        long left = 0 , right = n;
        while (left <= right){
            long mid = left + (right - left)/2;
            long sq = mid*mid;
            if(sq == n){
                return mid;
            }else if(sq > n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}
