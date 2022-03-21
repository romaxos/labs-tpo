package firstTask;

import java.util.Hashtable;

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

//    Hashtable<String, String>

    /* разложение функции arcsin в степенной ряд */
    public static Double func(Double x) {
        if (abs(x) <= 1) {
            double result = x;
            int multiplier = 1;
            int power = 3;
            for (int n = 1; n <= 33; n++) {
                // n -> (fact(2 * n) / (4.0.pow(n) * fact(n).toDouble().pow(2) * (2 * n + 1))) * x.pow(2 * n + 1) }
//                 result += (fact(fact(multiplier)) * pow(x, power)) / (fact(fact(multiplier + 1)) * (multiplier + 2));
//                 multiplier += 2;
//                 power += 2;
                result += (fact(2 * n) / (pow(4.0, n) * pow(fact(n), 2) * (2 * n + 1))) * pow(x, (2 * n + 1));
            }
            return result;
        }
        return Double.NaN;
    }

}
