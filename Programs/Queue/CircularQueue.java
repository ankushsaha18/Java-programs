package Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return end - front == data.length;
    }

    public boolean isEmpty(){
        return end - front == 0;
    }
    // insert()  ---> Complexity = O(1)
    public void insert(int x) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end % data.length] = x;
        end++;
    }
    // remove()  ---> Complexity = O(1)
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val = data[front % data.length];
        front ++;
        return val;
    }
    // display()  ---> Complexity = O(n)
    public void display(){
        for(int i = front ; i < end ; i++){
            System.out.print(data[i % data.length] + " ");
        }
        System.out.println("END");
    }
}
