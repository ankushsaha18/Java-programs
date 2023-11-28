import java.util.*;
public class test{
   public static void main(String[] args) {
      int[] nums={1,2,3,4,5,6,7};
   int k=3;
   reverse(nums,k);
   }
   
   static void rev(int[] nums,int start,int end){
      ArrayList<Integer> ar2=new ArrayList<>();
     for(int i=end;i>=start;i--){
        ar2.add(nums[i]);
     }

     for(int i=0;i<ar2.size();i++){
        nums[start+i]=ar2.get(i);
     }
   }

    public static void reverse(int nums[], int k){
      System.out.println(Arrays.toString(nums));
    rev(nums,0,nums.length-1);
    rev(nums,0,k-1);
    rev(nums,k,nums.length-1);
    System.out.println(Arrays.toString(nums));
     
    }
  }
