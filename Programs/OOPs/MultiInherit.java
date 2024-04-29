package OOPs;

public class MultiInherit {
    public static void main(String[] args) {
        Gorkha obj = new Gorkha(35,10000,"Green-Brown","China Border",1000000);
        System.out.println(obj.location);
    }
}
class Defence{
    int ageLimit;
    int pension;
    Defence(int ageLimit, int pension) {
        this.ageLimit = ageLimit;
        this.pension = pension;
    }
}
class Army extends Defence{
    String DressCode;
    public Army(int ageLimit, int pension, String dressCode) {
        super(ageLimit, pension);
        DressCode = dressCode;
    }
}
class Gorkha extends Army{
    String location;
    int armourCost;
    Gorkha(int ageLimit, int pension, String dressCode, String location, int armourCost) {
        super(ageLimit, pension, dressCode);
        this.location = location;
        this.armourCost = armourCost;
    }
}
