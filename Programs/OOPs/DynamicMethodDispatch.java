package OOPs;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Box obj = new BoxWeight(20,120);
    }
}
class Box{
    int l;
    int b;
    int h;
    Box(int side){
        l = side;
        b = side;
        h = side;
    }
    Box(){
        l=0;
        b=0;
        h=0;
    }
}
class BoxWeight extends Box{
    int weight;
    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }
}
