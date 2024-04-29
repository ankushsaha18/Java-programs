package OOPs.Interfaces;

public class NestedInterface {
    public static void main(String[] args) {
        A obj = new A();
        obj.HelloWorld();
    }
}
class A implements B.Hello{
    @Override
    public void HelloWorld() {
        System.out.println("Hello World");
    }
}
class B{
    public interface Hello{
        void HelloWorld();
    }
}
