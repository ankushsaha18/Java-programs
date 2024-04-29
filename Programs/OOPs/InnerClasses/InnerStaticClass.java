package OOPs.InnerClasses;

public class InnerStaticClass {
    public static void main(String[] args) {
        testr.Test2 obj = new testr.Test2("Ankush");
        System.out.println(obj.name);
    }
}
class testr{
    int a = 100;
    static class Test2{
        String name;
        Test2(String name){
            this.name = name;
        }
    }
}
