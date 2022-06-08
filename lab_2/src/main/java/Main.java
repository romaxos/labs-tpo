import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import main.MyApp;

public class Main {

    private static final double ACCURACY = 0.001;
    public static void main(String[] args) {
        Cos cosFunction = new Cos(ACCURACY);
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwo logTwoFunction = new LogTwo(ACCURACY, lnFunction);
        MyApp myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
//        CsvLogger csvLogger = new CsvLogger("computer_result.csv");
//        csvLogger.log(myApp);


        System.out.println(sinFunction.compute(10 * Math.PI / 3.1415926));
        System.out.println(sinFunction.compute(100 * Math.PI / 3.1415926));
        System.out.println(sinFunction.compute(1000 * Math.PI / 3.1415926));
        System.out.println(sinFunction.compute(-10 * Math.PI / 3.1415926));
        System.out.println(sinFunction.compute(-100 * Math.PI / 3.1415926));
        System.out.println(sinFunction.compute(-1000 * Math.PI / 3.1415926));




    }
}
