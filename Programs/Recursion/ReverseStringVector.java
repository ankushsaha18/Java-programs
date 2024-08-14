package Recursion;
import java.util.Vector;

public class ReverseStringVector {
    public Vector<Character> reverseString(Vector<Character> s) {
        //your code goes here
        reverse(s,0,s.size()-1);
        return s;
    }
    public void reverse(Vector<Character> s,int left,int right){
        if(left >= right){
            return;
        }
        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);
        reverse(s,left+1,right-1);
    }
}
