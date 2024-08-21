package LogicAndMath;

import java.util.*;

class revsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.trim().split(" ");
        String out = "";
        for (int i = str.length - 1; i >= 0; i--) {
            out += str[i] + " ";
        }
        System.out.println(out);
    }
}