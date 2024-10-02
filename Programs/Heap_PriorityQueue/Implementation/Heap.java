package Heap_PriorityQueue.Implementation;

public class Heap{

    public int[] arr;
    private int size = 0;
    public Heap(){
        arr = new int[5];
    }

    private void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private int parent(int i){
        return i/2;
    }
    private int left(int i){
        return 2*i; // 0 indexed
    }
    private int right(int i){
        return 2*i+1; // 0 indexed
    }

    private void resize(){
        int[] nr = new int[arr.length*2];
        System.arraycopy(arr, 0, nr, 0, arr.length);
        arr = nr;
    }
    public void insert(int val){
        size++;
        if(size >= arr.length){
            resize();
        }
        int i = size;
        arr[i] = val;
        while (i > 1){
            int parent = i/2;
            if(arr[parent] < arr[i]){
                swap(arr,i,parent);
                i = parent;
            }else {
                return;
            }
        }
    }

    public void delete(){
        if(size == 0){
            return;
        }
        arr[1] = arr[size];
        size--;
        int i = 1;
        while (i < size){
            int left = left(i);
            int right = right(i);
            if (left < size && arr[i] < arr[left]){
                swap(arr,i,left);
                i = left;
            }
            else if (right < size && arr[i] < arr[right]){
                swap(arr,i,right);
                i = right;
            }else{
                return;
            }
        }
    }

    public void heapify(int[] a,int n,int i){
        int largest = i;
        int l = left(i);
        int r = right(i);
        if(l < n && largest < a[l]){
            largest = l;
        }
        if(r < n && largest < a[r]){
            largest = r;
        }
        if(largest != i){
            swap(a,i,largest);
            heapify(a,n,largest);
        }
    }

    public void buildheap(int[] A){
        int n = A.length-1;
        for(int i = n/2 ; i > 0 ; i--){
            heapify(A,n,i);
        }
    }

    public void heapsort(int[] A){
        buildheap(A);
        int n = A.length-1;
        for(int i = n ; i > 1 ; i--){
            swap(A,1,i);
            heapify(A,i-1,1);
        }
    }

    public void print(){
        for(int i = 1 ; i <= size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
