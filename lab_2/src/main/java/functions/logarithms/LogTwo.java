package functions.logarithms;

import functions.Func;

import java.text.DecimalFormat;

public class LogTwo extends Func {
    private final static int BASIS = 2;

    private final Ln lnFunc;
    private final DecimalFormat df = new DecimalFormat("#.#####");

    public LogTwo(double accuracy, Ln lnFunc) {
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
        System.out.println("ln 1 res : " + lnFunc.compute(x));
        System.out.println("ln 2 res : " + lnFunc.compute(BASIS));
        System.out.println("basis res: " + BASIS);
        System.out.println("argument res : " + x);
        return Double.parseDouble(df.format(lnFunc.compute(x) / lnFunc.compute(BASIS)).replace(",", "."));
    }
}
