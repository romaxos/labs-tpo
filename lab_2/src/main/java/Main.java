import functions.logarithms.Ln;
import functions.logarithms.Log2;

public class Main {
    public static void main(String[] args) {
        Ln test = new Ln(0.001);
        Log2 test2 = new Log2(0.001, test);
        System.out.println("ans: " + test2.compute(8));
    }
}
