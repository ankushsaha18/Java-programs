package BitManipulation.Logic;

public class getBit {
    public static void main(String[] args) {
        int num = 25;
        int pos = 1; // at which position from last you want to know the bit
        int bitMask = 1 << (pos - 1); // left shiftion (pos-1) times takes one to that position of bit
        if ((num & bitMask) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was one");
        }
    }
}
