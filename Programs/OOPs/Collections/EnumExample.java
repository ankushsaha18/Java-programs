package OOPs.Collections;

public class EnumExample {
    public static void main(String[] args) {
        Week week = Week.Wednesday;
        System.out.println(week.ordinal());
        for(Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(Week.valueOf("Tuesday"));
    }
}
