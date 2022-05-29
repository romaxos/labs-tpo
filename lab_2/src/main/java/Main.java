import functions.logarithms.Ln;
import functions.logarithms.Log2;
import functions.trig.Cos;

public class Main {
    public static void main(String[] args) {
        Ln test = new Ln(0.001);
        Log2 test2 = new Log2(0.001, test);
        Cos test3 = new Cos(0.001);
        System.out.println("ans: " + test3.compute(0.23));
    }
}
