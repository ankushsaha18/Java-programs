package OOPs.Generics;

public class GenArrLstImpl {
    public static void main(String[] args) {
        GenericArrayLst<String> lst = new GenericArrayLst<>();
        lst.add("Hello");
        lst.add("1");
        System.out.println(lst);
    }
}
