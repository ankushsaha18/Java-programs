package OOPs.Generics;

public class calculations {
    Operation sum = (a,b) -> a + b;
    Operation prod = (a,b) -> a*b;
    Operation sub = (a,b) -> a-b;

    public int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}
