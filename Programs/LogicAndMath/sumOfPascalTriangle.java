package LogicAndMath;

public class sumOfPascalTriangle {
    public static void main(String[] args) {
        int row = 5;
        System.out.println(sumOfNthRow(row));
    }

    public static int sumOfNthRow(int row) {
        return 1 << (row - 1); // 1 << (row - 1) = 2^(n-1)
    }
}
