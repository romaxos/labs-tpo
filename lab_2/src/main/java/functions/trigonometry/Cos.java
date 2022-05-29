package functions.trigonometry;

import functions.Func;

public class Cos extends Func {
    private static final int COUNT_ITERATION = 1000000;

    public Cos(double accuracy) {
        super(accuracy);
    }

    private long fact(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) result *= i;
        return result;
    }

    @Override
    public double compute(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI * 2;

        double result = 0, prev = 0;
        int sign = 1, i = 0;
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        while (getAccuracy() <= Math.abs((sign * Math.pow(x, 2 * i)) / fact(2 * i) - prev) && i < COUNT_ITERATION) {
            result += (sign * Math.pow(x, 2 * i)) / fact(2 * i);
            prev = (sign * Math.pow(x, 2 * i)) / fact(2 * i);
            sign = -sign;
            i++;
        }
        return result;
    }
}
