package BitManipulation.Logic;

public class checkPowerOf2 {
    public static void main(String[] args){
        int n=5;
        if((n & (n-1))==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
