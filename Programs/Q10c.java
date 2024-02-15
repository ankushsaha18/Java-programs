public class Q10c {
    public static void main(String[] args) {
        System.out.println(numberOfDaysInYear(2020));
    }

    public static int numberOfDaysInYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return 366;
        }
        return 365;
    }
}
