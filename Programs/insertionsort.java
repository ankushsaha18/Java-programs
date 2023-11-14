import java.util.*;
public class insertionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" th element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
        }
        arr[j+1]=curr;
        System.out.print("Sorted array is: ");
    }for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
    

}
