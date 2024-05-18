package Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public CustomQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }
    // insert()  ---> Complexity = O(1)
    public void insert(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        data[end++] = x;
    }
    // remove()  ---> Complexity = O(n)
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val = data[0];
        for(int i = 1 ; i < data.length ; i++){
            data[i-1] = data[i];
        }
        end--;
        return val;
    }
    // display()  ---> Complexity = O(n)
    public void display(){
        for(int i = 0 ; i < end ; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
}
