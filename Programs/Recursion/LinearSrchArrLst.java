package Recursion;

import java.util.ArrayList;

public class LinearSrchArrLst {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,8,4,6,7,4};
        System.out.println(checkAllIndex(arr,4,0));
    }
    public static ArrayList<Integer> checkAllIndex(int[] arr,int target,int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n == arr.length){
            return list;
        }
        if(arr[n] == target){
            list.add(n);
        }
        ArrayList<Integer> temp = checkAllIndex(arr,target,n+1);
        list.addAll(temp);
        return list;
    }
}
