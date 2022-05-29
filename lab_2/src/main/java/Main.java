import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;

public class Main {
    public static void main(String[] args) {
        Ln test = new Ln(0.001);
        LogTwo test2 = new LogTwo(0.001, test);
        Cos test3 = new Cos(0.001);
        Sin test4 = new Sin(0.001, test3);
        System.out.println("ans: " + test4.compute(-Math.PI / 2));
    }
}
