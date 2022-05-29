package main;

import functions.Func;
import functions.trig.Sin;
import functions.logarithms.*;

public class MyApp extends Func {
    private final Sin sinFunction;
    private final Ln lnFunctions;
    private final LogTwo logTwoFunctions;

    public MyApp(double accuracy, Sin sinFunction, Ln lnFunctions, LogTwo logTwoFunctions) {
        super(accuracy);
        this.sinFunction = sinFunction;
        this.lnFunctions = lnFunctions;
        this.logTwoFunctions = logTwoFunctions;
    }

    @Override
    public double compute(double x) {
        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        if (x <= 0) {
            return sinFunction.compute(x);
        } else {
            return (Math.pow(Math.pow(Math.pow(lnFunctions.compute(x), 2) - logTwoFunctions.compute(x), 3), 2)) / (logTwoFunctions.compute(x) * lnFunctions.compute(x));
        }
    }
}
