package main;

import functions.logarithms.Ln;
import functions.logarithms.LogFactory;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
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
        myApp = new MyApp(ACCURACY, TrigFactory.getSinMock(), LogFactory.getLnMock(), LogFactory.getLogTwoMock());
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void firstStubTest(double numerator, double denominator, double expected) {
        Cos cosFunction = TrigFactory.getCosMock();
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = LogFactory.getLnMock();
        LogTwo logTwoFunction = LogFactory.getLogTwoMock();
        myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void secondStubTest(double numerator, double denominator, double expected) {
        Cos cosFunction = TrigFactory.getCosMock();
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = LogFactory.getLnMock();
        LogTwo logTwoFunction = new LogTwo(ACCURACY, lnFunction);
        myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void thirdStubTest(double numerator, double denominator, double expected) {
        Cos cosFunction = TrigFactory.getCosMock();
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwo logTwoFunction = new LogTwo(ACCURACY, lnFunction);
        myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/integration_test.csv")
    public void fourthStubTest(double numerator, double denominator, double expected) {
        Cos cosFunction = new Cos(ACCURACY);
        Sin sinFunction = new Sin(ACCURACY, cosFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwo logTwoFunction = new LogTwo(ACCURACY, lnFunction);
        myApp = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
        double actual = myApp.compute(numerator * Math.PI / denominator);
        assertEquals(expected, actual, DELTA);
    }
}
