package Queue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }
    public void insert(int x) {
        if(isFull()){
            int temp[] = new int[data.length * 2];
            for(int i = 0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        data[end % data.length] = x;
        end++;
    }
}
