public class gradegiver {
    public static void grade(double marks) {
        switch ((int) marks / 10) {
            case 10 -> System.out.println("AA");
            case 9 -> System.out.println("AA");
            case 8 -> System.out.println("AB");
            case 7 -> System.out.println("BB");
            case 6 -> System.out.println("BC");
            case 5 -> System.out.println("CD");
            case 4 -> System.out.println("DD");
            default -> System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        double marks = 89.99;
        grade(marks);
    }
}
