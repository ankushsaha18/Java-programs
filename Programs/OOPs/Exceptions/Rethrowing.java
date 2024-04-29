package OOPs.Exceptions;

public class Rethrowing {
    public static void main(String[] args) {
        printString obj = new printString();
        try{
            obj.length();
        }catch (Exception e){
            System.out.println("Rethrown Exception caught");
        }
    }
}
class printString{
    String a = "Java";
    void length(){
        try{
            System.out.println(a.charAt(4));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
