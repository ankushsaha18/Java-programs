package OOPs.Abstraction;

public class ITER {
    public static void main(String[] args) {
        SOA obj = new SOA("ITER");
        System.out.println("College name is:" + obj.collegeName);
        obj.numStu(10000);
        obj.fest();
    }
}
