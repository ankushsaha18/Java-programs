package OOPs;

public class InnerStaticClass {
    static class Test2{
        String name;
        Test2(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {

        Test2 obj = new Test2("Rahul");
    }
}
