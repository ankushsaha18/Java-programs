package OOPs.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setter("Ankush",18);
        obj.getter();
    }
}
class Human{
    private String name;
    private int age;

    public void setter(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void getter(){
        System.out.println(name + "\t" + age);
    }
}
