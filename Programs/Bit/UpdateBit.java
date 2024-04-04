package Bit;

public class UpdateBit {
    public static void main(String[] args) {
        int num = 29;
        int pos = 3;
        int setbit = 0; // which bit u want to set at that pos (0 or 1)
        int bitMask = 1 << (pos - 1);
        if (setbit == 1) {
            // setBit
            int newNum = num | bitMask;
            System.out.println(newNum);
        } else if (setbit == 0) {
            // clearBit
            bitMask = ~bitMask;
            int newNum = num & bitMask;
            System.out.println(newNum);
        }
    }
}
