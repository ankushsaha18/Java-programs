public class Q10b {
    public static void main(String[] args) {
        System.out.println("Area of circle:" + area(2.5));
        System.out.println("Area of square:" + area(2.2f));
        System.out.println("Area of rectangle:" + area(2.1, 8.55));
    }

    public static double area(double radius) { // area of circle
        return Math.PI * radius * radius;
    }

    public static float area(float side) { // area of square
        return side * side;
    }

    public static double area(double a, double b) { // area of rectangle
        return a * b;
    }
}
