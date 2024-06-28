package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Toh(1,"A","B","C");
    }
    public static void Toh(int n,String src,String help,String dest){
        if(n == 0){
            return;
        }
        Toh(n-1,src,dest,help);
        System.out.println("Transferred disk " + n + " from " + src + " to " + dest);
        Toh(n-1,help,src,dest);
    }
}
