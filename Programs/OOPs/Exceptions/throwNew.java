package OOPs.Exceptions;

public class throwNew {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try{
            System.out.println(divide(a,b));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    static int divide(int a,int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
}
