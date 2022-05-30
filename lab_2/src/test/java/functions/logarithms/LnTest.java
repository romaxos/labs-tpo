package functions.logarithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class LnTest {

    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private Ln lnFunction;

    @BeforeEach
    void setUp() {
        this.lnFunction = new Ln(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions/logarithms/ln_data_test.csv")
    @DisplayName("General ln tests")
    public void generalValueTest(double numerator, double denominator, double expected) {
        double actual = lnFunction.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }




}
