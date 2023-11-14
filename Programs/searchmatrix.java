import java.util.*;
public class searchmatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:");
        int rows=sc.nextInt();
        System.out.print("Enter columns:");
        int columns=sc.nextInt();
        int g=0;
        int[][] matrix=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Enter "+(j+1)+" th element of "+(i+1)+" th row of matrix:");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter element to search:");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(matrix[i][j]==x){
                    System.out.print("Element "+x+" found at "+(i+1)+" th row and "+(j+1)+" th column");
                    g++;
                }
                }
            }if(g==0){
                System.out.println("No such element found");
            }
        
        
        }
        
    }
    

