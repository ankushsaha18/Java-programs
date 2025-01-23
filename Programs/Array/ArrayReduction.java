package Array;

import java.util.Arrays;

public class ArrayReduction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = reduction(arr);
        System.out.println(count);
    }
    public static int reduction(int[] arr){
        int count = 0;
        while (arr.length > 1){
            count++;
            int[] newArr = new int[arr.length-1];
            newArr[0] = arr[0] + arr[1];
            for(int i = 2 ; i < arr.length ; i++){
                newArr[i-1] = arr[i];
            }
            arr = newArr;
            System.out.println(Arrays.toString(arr));
        }
        return count;
    }
}
