package functions.trig;

import functions.Func;

public class Sin extends Func {
    private final Cos cosFunction;

    public Sin(double accuracy, Cos cosFunction) {
        super(accuracy);
        this.cosFunction = cosFunction;
    }

    @Override
    public double compute(double x) {
        int period = (int) (x / (Math.PI * 2));
        x -= period * Math.PI *2;

        int sign;

        if((x > Math.PI && x < Math.PI * 2) || (x < 0.0 && x > -Math.PI)) {
            sign = -1;
        } else {
            sign = 1;
        }

        return sign * Math.sqrt(1 - Math.pow(cosFunction.compute(x), 2));
    }
}
