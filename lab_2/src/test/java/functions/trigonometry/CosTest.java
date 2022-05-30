package functions.trigonometry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class CosTest {

    private static final double DELTA = 0.05;

    private static final double ACCURACY = 0.001;

    private Cos cosFunction;

    @BeforeEach
    void setup(){
        this.cosFunction = new Cos(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/trigonometry/cos_data_test.csv")
    @DisplayName("Generel cos tests")
    public void generalValueTest(double numerator, double denominator, double expected) {
        double actual = cosFunction.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin negative infinity test")
    public void negativeInfinityTest() {
        double expected = Double.NaN;
        double actual = cosFunction.compute(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin positive infinity test")
    public void positiveInfinityTest() {
        double expected = Double.NaN;
        double actual = cosFunction.compute(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Sin nan test")
    public void nanTest() {
        double expected = Double.NaN;
        double actual = cosFunction.compute(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }





}
