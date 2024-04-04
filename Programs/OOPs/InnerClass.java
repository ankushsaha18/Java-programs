package OOPs;
public class InnerClass{
    class Test{
        String name;
        Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args){
        InnerClass obj=new InnerClass();
        InnerClass.Test obj1 = obj.new Test("Ankush");
        System.out.println(obj1.name);
    }
}