package OOPs.Generics;

public class Student implements Comparable<Student>{
    String name;
    int roll;
    int marks;
    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        int diff = this.marks-o.marks;
        return diff;
    }
    @Override
    public String toString() {
        return marks + "";
    }
}
