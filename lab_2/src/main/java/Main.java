import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import main.MyApp;
import util.CsvLogger;

public class Main {

    private static final double ACCURACY = 0.001;
    public static void main(String[] args) {
        Cos cosFunction = new Cos(ACCURACY);
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwo logTwoFunction = new LogTwo(ACCURACY, lnFunction);
//        MyApp myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
//        CsvLogger csvLogger = new CsvLogger("computer_result.csv");
//        csvLogger.log(myApp);
        System.out.println(cosFunction.compute(0.0));
        System.out.println(cosFunction.compute(1 * Math.PI / 4));
        System.out.println(cosFunction.compute(1 * Math.PI / 2));
        System.out.println(cosFunction.compute(3 * Math.PI / 4));
        System.out.println(cosFunction.compute(1 * Math.PI));
        System.out.println(cosFunction.compute(5 * Math.PI / 4));
        System.out.println(cosFunction.compute(3 * Math.PI / 2));
        System.out.println(cosFunction.compute(7 * Math.PI / 4));
        System.out.println(cosFunction.compute(2 * Math.PI));

        System.out.println(cosFunction.compute(-1 * Math.PI / 4));
        System.out.println(cosFunction.compute(-1 * Math.PI / 2));
        System.out.println(cosFunction.compute(-3 * Math.PI / 4));
        System.out.println(cosFunction.compute(-1 * Math.PI));
        System.out.println(cosFunction.compute(-5 * Math.PI / 4));
        System.out.println(cosFunction.compute(-3 * Math.PI / 2));
        System.out.println(cosFunction.compute(-7 * Math.PI / 4));
        System.out.println(cosFunction.compute(-2 * Math.PI / 1));



    }
}
