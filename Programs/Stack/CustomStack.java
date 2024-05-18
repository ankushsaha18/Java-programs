package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int push(int x) throws Exception {
        if(isFull()){
            throw new Exception("Stack Overflow Exception");
        }
        data[++top] = x;
        return top;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack Underflow Exception");
        }
        return data[top--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack Underflow Exception");
        }
        return data[top];
    }
}
