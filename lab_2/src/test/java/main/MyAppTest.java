package main;

import functions.logarithms.LogFactory;
import functions.trigonometry.TrigFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyAppTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    static MyApp myApp;


    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void allStubsTest(double numerator, double denominator, double expected) {
        myApp = new MyApp(ACCURACY, TrigFactory.getSinMock(), LogFactory.getLnMock(), LogFactory.getLogTwoBaseMock());
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }
}
