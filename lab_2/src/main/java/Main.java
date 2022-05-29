import functions.logarithms.Ln;
import functions.logarithms.Log2;
import functions.trig.Cos;
import functions.trig.Sin;

public class Main {
    public static void main(String[] args) {
        Ln test = new Ln(0.001);
        Log2 test2 = new Log2(0.001, test);
        Cos test3 = new Cos(0.001);
        Sin test4 = new Sin(0.001, test3);
        System.out.println("ans: " + test4.compute(-Math.PI / 2));
    }
}
