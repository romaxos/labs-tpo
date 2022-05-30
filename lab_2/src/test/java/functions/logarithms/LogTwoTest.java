package functions.logarithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Log two tests")
public class LogTwoTest {

    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private LogTwo logTwoFunction;

    @BeforeEach
    void setUp() {
        this.logTwoFunction = new LogTwo(ACCURACY, LogFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/logarithms/log_two_data_test.csv")
    @DisplayName("General log two tests")
    public void tableValuesTest(double numerator, double denominator, double expected) {
        double actual = logTwoFunction.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = logTwoFunction.compute(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = logTwoFunction.compute(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test log two nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = logTwoFunction.compute(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }
}
