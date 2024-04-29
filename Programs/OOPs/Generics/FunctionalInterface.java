package OOPs.Generics;

public class FunctionalInterface {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Lamda expression");
        obj.show();
    }
}
@java.lang.FunctionalInterface
interface A{
    void show();
}

