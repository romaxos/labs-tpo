package functions.logarithms;

import functions.Func;

import java.text.DecimalFormat;

public class Log2 extends Func {
    private final static int BASE = 2;

    private final Ln lnFunc;
    private final DecimalFormat df = new DecimalFormat("#.#####");

    public Log2(double accuracy, Ln lnFunc) {
        super(accuracy);
        this.lnFunc = lnFunc;
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return Double.parseDouble(df.format(lnFunc.compute(x) / lnFunc.compute(BASE)).replace(",", "."));
    }
}
