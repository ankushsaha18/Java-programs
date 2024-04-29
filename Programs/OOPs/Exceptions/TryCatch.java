package OOPs.Exceptions;

public class TryCatch {
    public static void main(String[] args) {
        int a = 55;
        int b = 5;
        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Always execute");
        }
    }
}
