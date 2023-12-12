public class LinearSearch{
    public static int linearsearch(int arr[],int x){
        int index=0;
        if(arr.length==0){
            index=-1;
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    index=i;
                }
            }
            return index;
        }
        public static void main(String[] args) {
            int arr[]={1,5,7,8,9,4,54,22,1,5};
            System.out.println("Found at Index:"+linearsearch(arr,54));
        }
    }
