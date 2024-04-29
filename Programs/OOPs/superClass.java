package OOPs;

public class superClass {
    public static void main(String[] args) {
    Topper obj = new Topper("Ankush",51,98);
    obj.show();
    }
}
class Student{
    String name;
    int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void show(){
        System.out.print(name+" having roll "+roll);
    }
}
class Topper extends Student{
    int marks;
    public Topper(String name, int roll, int marks) {
        super(name, roll);
        this.marks = marks;
    }
    void show(){
        super.show();
        System.out.print(" got marks = "+marks);
    }
}
