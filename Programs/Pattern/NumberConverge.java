package Pattern;

public class NumberConverge {
    public static void main(String[] args) {
        int n = 4;
        for(int i = n ; i > 0 ; i--){
            for(int j = n ; j > 0 ; j--){
                System.out.print(Math.max(i,j) + " ");
            }
            for(int j = 2 ; j <= n ; j++){
                System.out.print(Math.max(i,j) + " ");
            }
            System.out.println();
        }
        for(int i = 2 ; i <= n ; i++){
            for(int j = n ; j > 0 ; j--){
                System.out.print(Math.max(i,j) + " ");
            }
            for(int j = 2 ; j <= n ; j++){
                System.out.print(Math.max(i,j) + " ");
            }
            System.out.println();
        }
    }
}
