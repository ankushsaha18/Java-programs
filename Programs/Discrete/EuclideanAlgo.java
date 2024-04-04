package Discrete;

public class EuclideanAlgo{
        public static void main(String[] args) {

            System.out.println(GCD(105,224));
        }

        public static int GCD(int a, int b) {
            if (a == 0) {
                return b;
            }
            return GCD(b % a, a);
        }
}

