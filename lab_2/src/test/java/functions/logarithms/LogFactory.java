package functions.logarithms;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogFactory {

    public static Ln getLnMock() {
        Ln lnFunction = mock(Ln.class);

        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.24145);
        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.45182);
        when(lnFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.85725);
        when(lnFunction.compute(Mockito.eq(1 * Math.PI))).thenReturn(1.14461);
        when(lnFunction.compute(Mockito.eq(5 * Math.PI / 4))).thenReturn(1.3674);
        when(lnFunction.compute(Mockito.eq(3 * Math.PI / 2))).thenReturn(1.55082);
        when(lnFunction.compute(Mockito.eq(7 * Math.PI / 4))).thenReturn(1.70376);
        when(lnFunction.compute(Mockito.eq(2 * Math.PI))).thenReturn(1.83838);
        when(lnFunction.compute(Mockito.eq(10.0))).thenReturn(2.30307);
        when(lnFunction.compute(Mockito.eq(100.0))).thenReturn(4.60545);
        when(lnFunction.compute(Mockito.eq(1000.0))).thenReturn(6.90796);

        when(lnFunction.compute(Mockito.eq(0.0))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(lnFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }

    public static LogTwo getLogTwoMock() {
        LogTwo logTwoFunction = mock(LogTwo.class);

        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.34809);
        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.65137);
        when(logTwoFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(1.23585);
        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI))).thenReturn(1.65013);
        when(logTwoFunction.compute(Mockito.eq(5 * Math.PI / 4))).thenReturn(1.97131);
        when(logTwoFunction.compute(Mockito.eq(3 * Math.PI / 2))).thenReturn(2.23574);
        when(logTwoFunction.compute(Mockito.eq(7 * Math.PI / 4))).thenReturn(2.45622);
        when(logTwoFunction.compute(Mockito.eq(2 * Math.PI))).thenReturn(2.6503);
        when(logTwoFunction.compute(Mockito.eq(10.0))).thenReturn(3.32022);
        when(logTwoFunction.compute(Mockito.eq(100.0))).thenReturn(6.63944);
        when(logTwoFunction.compute(Mockito.eq(1000.0))).thenReturn(9.95886);

        when(logTwoFunction.compute(Mockito.eq(0.0))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-10.0))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-100.0))).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Mockito.eq(-1000.0))).thenReturn(Double.NaN);

        when(logTwoFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTwoFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return logTwoFunction;
    }
}
