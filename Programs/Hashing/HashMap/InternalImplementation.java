package Hashing.HashMap;

public class InternalImplementation {
    public static void main(String[] args) {
        Internal<String,Integer> obj = new Internal();
        obj.put("Ankush",51);
        obj.remove("Ankush");
        System.out.println(obj.isEmpty());
    }
}
