package BinarySearch;

public class FindNthRoot {
    public static void main(String[] args) {
        int n = 4;
        int m = 81;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int N, int M) {
        int left  = 0 , right = M;
        while (left <= right){
            int mid = left + (right - left)/2;
            int range = (int)Math.pow(mid,N);
            if(range == M){
                return mid;
            }
            else if(range > M){ // this means we have exceeded the value
                right = mid - 1;
            }else{               // this means we are less than the value
                left = mid + 1;
            }
        }
        return -1;
    }
}
