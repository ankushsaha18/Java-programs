package Bit;

public class setBit {
    public static void main(String[] args) {
        int num = 25;
        int pos = 3; // at which position from last you want to set the bit
        int bitMask = (1 << (pos - 1));
        int newNum = num | bitMask;
        System.out.println(newNum);
    }
}
