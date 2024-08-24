package Recursion.General;

public class FirstAndLastOccurence {
    static int first = -1;
    static int last = -1;
    public static void main(String[] args) {
        String s = "abcfdaankfkab";
        char c = 'a';
        occurence(s,c,0);
        System.out.println(first + " " + last);
    }
    public static void occurence(String s,char c,int index){
        if(index == s.length()){
            return;
        }
        if(s.charAt(index) == c){
            if(first == -1){
                first = index;
                last = index;
            }
            else{
                last = index;
            }
        }
        occurence(s,c,index + 1);
    }
}
