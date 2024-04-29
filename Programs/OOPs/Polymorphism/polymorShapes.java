package OOPs.Polymorphism;
// Both Method Overloading and Method Overriding is present
public class polymorShapes {
    public static void main(String[] args) {
        Shapes obj = new Shapes();
        obj.area();
        Shapes obj1 = new circle();
        obj1.area();
        square obj2 = new square();
        obj2.area();
    }
}
class Shapes{
    void area(){
        System.out.println("This is shape class");
    }
}
class square extends Shapes{
    @Override
    void area(){ // Overloading
        System.out.println("This is square");
    }
}
class circle extends Shapes{
    @Override
    void area(){ // Overriding
        System.out.println("This is circle");
    }
}
