package LogicAndMath;

public class compoundInterest {
    // This method is not used as the time complexity is high we use direct formula
    // CI=(p*(Math.pow((1+rate)/100,time)))-p;
    public static void main(String[] args) {
        double p = 1200;
        double r = 5.4;
        int t = 2;
        double interest = 0;
        for (int i = 1; i <= t; i++) {
            interest += r / 100 * p;
            p += r / 100 * p;
        }
        System.out.println(interest);
    }
}
