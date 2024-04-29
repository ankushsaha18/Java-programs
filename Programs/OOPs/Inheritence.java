package OOPs;

public class Inheritence {
    public static void main(String[] args) {
        Lion obj = new Lion();
        obj.name = "king";
        obj.type = "wild";
        obj.nature = "fierce";
        obj.diet = "meat";
        obj.show();
    }

}

class species{
    String type;
    String nature;
}

class Lion extends species{
    String diet;
    String name;
    void show(){
        System.out.println(name+" "+type+" "+nature+" "+diet);
    }
}
