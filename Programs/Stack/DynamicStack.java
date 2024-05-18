package Stack;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    public int push(int x){
        if(isFull()){
            int temp[] = new int[data.length * 2];
            for(int i = 0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++top] = x;
        return top;
    }
}
