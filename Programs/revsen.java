import java.util.*;
class revsen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");
      
        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            System.out.println(str[i]);
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
      System.out.println(out+str[0]);
    }
}