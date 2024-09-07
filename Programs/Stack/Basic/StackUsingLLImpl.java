package Stack.Basic;

public class StackUsingLLImpl {
    public static void main(String[] args) {
        StackUsingLL stl = new StackUsingLL();
        stl.pop();
        stl.push(5);
        stl.push(7);
        stl.display();
        stl.pop();
        stl.display();
    }
}
