import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import main.MyApp;

public class Main {
    public static void main(String[] args) {
        Ln test = new Ln(0.001);
        LogTwo test2 = new LogTwo(0.001, test);
        Cos test3 = new Cos(0.001);
        Sin test4 = new Sin(0.001, test3);
        MyApp myApp = new MyApp(0.001, test4, test, test2);
        System.out.println("ans: " + myApp.compute(-1.0 * Math.PI / 4));
        System.out.println("ans: " + myApp.compute(-1.0 * Math.PI / 2));
        System.out.println("ans: " + myApp.compute(-3.0 * Math.PI / 4));
        System.out.println("ans: " + myApp.compute(-1.0 * Math.PI));
        System.out.println("ans: " + myApp.compute(-5.0 * Math.PI / 4));
        System.out.println("ans: " + myApp.compute(-3.0 * Math.PI / 2));
        System.out.println("ans: " + myApp.compute(0.0));
        System.out.println("ans: " + myApp.compute(1.0 * Math.PI / 4));
        System.out.println("ans: " + myApp.compute(1.0 * Math.PI / 2));
        System.out.println("ans: " + myApp.compute(3.0 * Math.PI / 4));
        System.out.println("ans: " + myApp.compute(1.0 * Math.PI));
        System.out.println("ans: " + myApp.compute(1.0));

    }
}
