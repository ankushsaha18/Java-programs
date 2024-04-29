package OOPs.Blocks;

public class StaticBlock {
    public static void main(String args[]) {
        Student1 stu = new Student1("Ankush", 18);
        Student1 stu2 = new Student1("Ankush", 18);
    }
}

class Student1 {
    String name;
    int age;
    static {
        System.out.println("Hello Students!!");
        System.out.println("HI");
    }

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
