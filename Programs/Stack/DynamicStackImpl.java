package Stack;

public class DynamicStackImpl {
    public static void main(String[] args) throws Exception {
        DynamicStack ds = new DynamicStack(5);
        ds.push(50);
        ds.push(20);
        ds.push(50);
        ds.push(10);
        ds.push(100);
        ds.push(57);
        ds.push(69);
        ds.push(145);
        System.out.println(ds.pop());
        System.out.println(ds.peek());
    }
}
