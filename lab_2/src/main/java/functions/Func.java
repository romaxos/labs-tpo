package functions;

public abstract class Func {
    private final double accuracy;

    public Func(double accuracy) {
        this.accuracy = accuracy;
    }

    public abstract double compute(double x);

    public double getAccuracy() {
        return accuracy;
    }
}
