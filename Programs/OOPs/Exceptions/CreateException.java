package OOPs.Exceptions;

public class CreateException {
    public static void main(String[] args) {
        String name = "Ankush";
        try {
            if(name.equals("Ankush")){
                throw new MyException("Name is Ankush");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
class MyException extends Exception{
    MyException(String message) {
        super(message);
    }
}
