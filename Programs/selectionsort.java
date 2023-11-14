import java.util.*;
public class selectionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" th element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                  small=j;
                }
            }
                int swap=arr[small];
                    arr[small]=arr[i];
                    arr[i]=swap;
        }
        System.out.print("Sorted array is: ");
        for(int i=0;i<size;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
    
}
