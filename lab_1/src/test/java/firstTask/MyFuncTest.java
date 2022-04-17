package firstTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("arcsin tests")
class MyFuncTest {

    private MyFunc myFunc;

    @BeforeEach
    void setUp() {
        this.myFunc = new MyFunc();
    }

    @ParameterizedTest(name = "Arcsin general tests")
    @CsvFileSource(resources = "arcsinTest.csv")
    void usualTest(String input, String expected) {
        double inputValue = Arrays.stream(input.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double expectedValue = Arrays.stream(expected.replaceAll(" ", "").split(";"))
                .mapToDouble(Double::parseDouble)
                .toArray()[0];
        double ACCURACY = 1e-3D;
        double myResult = myFunc.func(inputValue);
        assertEquals(expectedValue, myResult, ACCURACY);
    }

    @ParameterizedTest(name = "Arcsin exeption tests")
    @ValueSource(doubles = {1.0, -1.0, 10, -10, 10000, -10000})
    void exceptionTest(double value) {
        assertThrows(ArithmeticException.class, () -> {
            myFunc.func(value);
        });
    }
}