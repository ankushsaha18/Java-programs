public class test {

    public static void main(String[] args) {
        int n = 1244;
        int b = 8;
        System.out.println(convertToAnyBase(n, b));
    }

    public static String convertToAnyBase(int n, int b) {
        String ans = "";
        if (b == 2) {
            while (n > 0) {
                ans += String.valueOf(n % 2);
                n /= 2;
            }
        } else if (b == 8) {
            while (n > 0) {
                ans += String.valueOf(n % 8);
                n /= 8;
            }
        } else if (b == 16) {
            while (n > 0) {
                if (n % 16 > 9) {
                    ans += String.valueOf((char) (65 + (n % 16) % 10));
                } else {
                    ans += String.valueOf(n % 16);
                }
                n /= 16;
            }
        }
        return stringReverse(ans);

    }

    public static String stringReverse(String a) {
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            result += String.valueOf(a.charAt(i));
        }
        return result;
    }
}
