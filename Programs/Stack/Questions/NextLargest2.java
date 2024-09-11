package Stack.Questions;
import java.util.Arrays;
import java.util.Stack;

public class NextLargest2 {
    public static void main(String[] args) {
        int[] arr = {5,7,1,7,6,0};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    public static int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 2*arr.length-1 ; i >= 0 ; i--){
            while (!st.isEmpty() && arr[i%arr.length] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%arr.length] = -1;
            }else{
                ans[i%arr.length] = st.peek();
            }
            st.push(arr[i%arr.length]);
        }
        return ans;
    }
}
