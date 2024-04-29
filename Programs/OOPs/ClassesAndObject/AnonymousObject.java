package OOPs.ClassesAndObject;

public class AnonymousObject {
    public static void main(String[] args) {
        new A().show();
    }
}
class A{
    A(){
        System.out.println("Object created");
    }
    void show(){
        System.out.println("show method used");
    }
}
