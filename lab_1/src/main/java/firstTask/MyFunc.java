package firstTask;

import static java.lang.Math.*;

public class MyFunc {

    /* вычисление факториала */
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    /* разложение функции arcsin в степенной ряд */
    public static Double func(Double x) {
        if (abs(x) < 1) {
            double result = x;
            int multiplier = 1;
            int power = 3;
            for (int i = 1; i <= 30; i++) {
                result += (fact(fact(multiplier)) * pow(x, power)) / (fact(fact(multiplier + 1)) * (multiplier + 2));
            }
            return result;
        }
        return Double.NaN;
    }

}
