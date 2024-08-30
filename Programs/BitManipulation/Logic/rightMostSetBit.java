package BitManipulation.Logic;

public class rightMostSetBit {
    public static void main(String[] args) {
        int num = 8;
        int pos = 1;
        int bitMask = 1;
        while ((num & bitMask) == 0) {
            bitMask = bitMask << 1;
            pos++;
        }
        System.out.println("Right most Set bit is: " + pos);
    }
}
