package functions.logarithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LnTest {

    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private Ln lnFunction;

    @BeforeEach
    void setUp() {
        this.lnFunction = new Ln(ACCURACY);
    }


}
