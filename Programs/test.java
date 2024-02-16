public class test {
    public static void findMissingNumbers(int[] arr1, int[] arr2) {
        for (int num1 : arr1) {
            boolean found = false;
            for (int num2 : arr2) {
                if (num1 == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(num1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 7, 5, 3, 9, 1, 6 };
        int[] array2 = { 2, 9, 7, 4, 1, 8 };
        System.out.print("Missing elements: ");
        findMissingNumbers(array1, array2);
        findMissingNumbers(array2, array1);
    }
}
