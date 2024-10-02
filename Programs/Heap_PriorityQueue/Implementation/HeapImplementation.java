package Heap_PriorityQueue.Implementation;

public class HeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(20);
        h.insert(50);
        h.insert(100);
        h.insert(200);
        h.insert(500);
        h.insert(1000);
        h.print();
        h.delete();
        h.print();
        int[] arr = {-1,54,53,55,52,50};
        h.heapsort(arr);
        for(int i = 1 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
