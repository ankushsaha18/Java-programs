package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
