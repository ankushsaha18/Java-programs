package OOPs.Blocks;

class Customer{
    String name;
    int amount;
    {
        System.out.println("Welcome to our store");
    }
    Customer(String name,int amount){
        this.name=name;
        this.amount=amount;
    }
}
public class InstanceBlock {
    public static void main(String[] args){
        Customer c1=new Customer("Ankush",1500);
        Customer c2=new Customer("Rahul",1900);

    }
}
