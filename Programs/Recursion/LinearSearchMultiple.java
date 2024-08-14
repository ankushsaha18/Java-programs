package Recursion;
import java.util.ArrayList;

public class LinearSearchMultiple {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,4,6,7,4};
        System.out.println(checkAllIndex(arr,4,0,new ArrayList<Integer>()));
    }
    public static ArrayList<Integer> checkAllIndex(int[] arr,int target,int n,ArrayList<Integer> list){
        if(n == arr.length){
            return list;
        }
        if(arr[n] == target){
            list.add(n);
        }
        return checkAllIndex(arr,target,n+1,list);
    }
}
