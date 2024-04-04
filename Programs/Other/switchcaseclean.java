package Other;

import java.util.*;
public class switchcaseclean {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();

        switch(inp){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Nomoshkar");
            default->System.out.println("choose a valid language!!");
        }

    }
    
}

    

