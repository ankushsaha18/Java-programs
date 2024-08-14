package Array;

import java.util.Arrays;
public class arrreverse {
    static void rev(int[] nums,int start,int end){
         while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
       int num[]={1,2,3,4,5,6};
       System.out.println(Arrays.toString(num));
       rev(num,0,num.length-1);
       System.out.println(Arrays.toString(num));
    }
    
}
