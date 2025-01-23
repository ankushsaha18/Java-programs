package Other;

public class test {

    public static void main(String[] args) {
        // Data
        double[] x = {77, 50, 71, 72, 81};
        double[] y = {82, 66, 78, 34, 47};

        // Calculate slope (m) and intercept (b)
        double m = calculateSlope(x, y);
        double b = calculateIntercept(x, y, m);

        // Output the result
        System.out.println("Linear Regression Line: y = " + m + "x + " + b);
        System.out.println(b + (m*75));
    }

    // Method to calculate the slope (m)
    public static double calculateSlope(double[] x, double[] y) {
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        // Slope formula: m = (nΣxy - ΣxΣy) / (nΣx² - (Σx)²)
        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        return m;
    }

    // Method to calculate the intercept (b)
    public static double calculateIntercept(double[] x, double[] y, double m) {
        double sumX = 0, sumY = 0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
        }

        // Intercept formula: b = (Σy - mΣx) / n
        double b = (sumY - m * sumX) / n;
        return b;
    }
}
