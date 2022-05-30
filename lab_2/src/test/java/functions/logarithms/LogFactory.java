package functions.logarithms;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LogFactory {

    public static Ln getLnMock() {
        Ln lnFunction = mock(Ln.class);

        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.64645);
        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.24145347290444164);
        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.046117597181290375);
        when(lnFunction.compute(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.73973);
        when(lnFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.85725);
        when(lnFunction.compute(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.96183);
        when(lnFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.45182);
        when(lnFunction.compute(Mockito.eq(5.0))).thenReturn(1.6094379124341);
        when(lnFunction.compute(Mockito.eq(2.0))).thenReturn(0.6931471805599);

        when(lnFunction.compute(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.compute(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }

    public static LogTwo getLogTwoBaseMock() {
        LogTwo logTwoFunction = mock(LogTwo.class);

        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.93195);
        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.34809);
        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.06649);
        when(logTwoFunction.compute(Mockito.eq(2 * Math.PI / 3))).thenReturn(1.06643);
        when(logTwoFunction.compute(Mockito.eq(3 * Math.PI / 4))).thenReturn(1.23585);
        when(logTwoFunction.compute(Mockito.eq(5 * Math.PI / 6))).thenReturn(1.38662);
        when(logTwoFunction.compute(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.65137);

        when(logTwoFunction.compute(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTwoFunction.compute(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTwoFunction.compute(Double.NaN)).thenReturn(Double.NaN);

        return logTwoFunction;
    }
}
