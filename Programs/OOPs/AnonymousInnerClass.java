package OOPs;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        ANM obj = new ANM("Ankush"){
            void show(){
                System.out.println("InnerClass");
                System.out.println(name);
            }
        };
        obj.show();
    }
}
class ANM{
    String name;
    ANM(String name){
        this.name = name;
    }
    void show(){
        System.out.println("ANM method");
    }
    void display(){
        System.out.println(name);
    }
}
