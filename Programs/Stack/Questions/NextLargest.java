package Stack.Questions;
import java.util.Arrays;
import java.util.Stack;

public class NextLargest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(Arrays.toString(nextLargerElement(arr)));
    }
    public static int[] nextLargerElement(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1 ; i >= 0 ; i--){
            while (!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
