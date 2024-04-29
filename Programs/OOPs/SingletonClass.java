package OOPs;


public class SingletonClass {
    public static void main(String[] args) {
        // cannot create object of ID as it is private
        ID obj = ID.getInstance();
        ID obj2 = ID.getInstance();
        // obj2 will point to same object of obj1
        // as only one object allowed
    }
}
class ID{
    private ID(){}
    private static ID instance;
    public static ID getInstance(){
        if(instance == null){
            instance = new ID();
        }
        return  instance;
    }
}