package Other;

import java.util.Scanner;
 
public class unqpattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
        System.out.println("----Pattern is----"); 
        for (int i = 1; i <= rows; i++) 
        {
            int num = i;
 
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(num+" ");
 
                num = num+rows-j;
            }
 
            System.out.println();
        }
 
        scanner.close();
    }
}
