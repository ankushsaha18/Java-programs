package Logic;

public class PythagoreanTriplet {
    static boolean pythcheck(int a, int b, int c) {
        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        System.out.println(pythcheck(a, b, c));
    }
}
