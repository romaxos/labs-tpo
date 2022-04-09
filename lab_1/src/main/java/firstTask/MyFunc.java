package firstTask;

import java.util.Hashtable;

import static java.lang.Math.*;

public class MyFunc {

    /* вычисление факториала */
    private double calculateFactorial(double n){
        double result = 1;
        for (int i = 1; i <= n; i ++){
            result = result*i;
        }
        return result;
    }

    /* разложение функции arcsin в степенной ряд */
    public double func(double x) throws ArithmeticException{
        double result;
        if (abs(x) >= 1) {
            throw new ArithmeticException("uncorrected input number");
        } else {
            result = 0;
            for (int n = 0; n <= 70; n++) {
                result += ((calculateFactorial(2 * n)) / (pow(2, 2 * n) * pow(calculateFactorial(n), 2))) * ((pow(x, 2 * n + 1)) / (2 * n + 1));
            }
        }
        return result;
    }
}
