package GreedyAlgorithm.Basics;
import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] Student = {1, 2};
        int[] Cookies = {1,2,3};
        System.out.println(findMaximumCookieStudents(Student,Cookies));
    }
    public static int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        Arrays.sort(Cookie);
        Arrays.sort(Student);
        int l = 0;
        int r = 0;
        while (l < Student.length && r < Cookie.length){
            if(Cookie[r] >= Student[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}
