package org.example;

public class Calculator {
    public double squareRoot(double n) {
        if (n < 0) {
            return Double.NaN;
        }
        return Math.sqrt(n);
    }

    public int factorial(double n) {
        if (n < 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public double naturalLogarithm(double n) {
        if (n <= 0) {
            return Double.NaN;
        }
        return Math.log(n);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

}
