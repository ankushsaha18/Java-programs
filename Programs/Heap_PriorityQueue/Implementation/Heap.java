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

    public void insert(int val){ // heapify up
        size++;
        if (size >= arr.length) {
            resize();
        }
        arr[size] = val;
        int i = size;
        while (i > 1) {
            int parent = parent(i);
            if (arr[parent] < arr[i]) {
                swap(arr, i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    public void delete(){  // Heapify Down
        if(size == 0){
            return;
        }
        arr[1] = arr[size];
        size--;
        int i = 1;
        while (2*i <= size) {
            int left = left(i);
            int right = right(i);
            int largerChild = left;
            if (right <= size && arr[right] > arr[left]) {
                largerChild = right;
            }
            if (arr[i] < arr[largerChild]) {
                swap(arr, i, largerChild);
                i = largerChild;
            } else {
                break;
            }
        }
    }

    public void heapify(int[] a,int n,int i){
        int largest = i;
        int l = left(i);
        int r = right(i);
        if(l < n && a[largest] < a[l]){
            largest = l;
        }
        if(r < n && a[largest] < a[r]){
            largest = r;
        }
        if(largest != i){
            swap(a,i,largest);
            heapify(a,n,largest);
        }
    }

    public void buildheap(int[] A){
        int n = A.length;
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
