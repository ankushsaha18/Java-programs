package Bit;

public class clearBit {
    public static void main(String[] args) {
        int num = 29;
        int pos = 3; // at which position from last you want to clear the bit
        int bitMask = ~(1 << (pos - 1)); // complement as we want 0 at the position we want to clear
        int newNum = num & bitMask;
        System.out.println(newNum);
    }
}
