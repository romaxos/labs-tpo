package secondTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HashTableArray tests")
class HashTableArrayTest {
    private final static int SIZE = 10;
    private HashTableArray hashTableArray;

    @BeforeEach
    void setUp() {
        this.hashTableArray = new HashTableArray(SIZE);
    }


    @ParameterizedTest(name = "Hash table put tests")
    @CsvFileSource(resources = "hashTableArrayTestPut.csv")
    void putTest(String input, String expected) {
        StringBuilder inputData = new StringBuilder(input.replaceAll(" ", ""));

        inputData.delete(0, 1);
        inputData.delete(inputData.length()-1, inputData.length());

        String[] p = inputData.toString().split(";");
        for (String s : p) {
            String[] keyVal = s.split("=");
            hashTableArray.put(keyVal[0], keyVal[1]);
        }
        assertEquals(hashTableArray.toString(), expected);
    }


    @ParameterizedTest(name = "Hash table get tests")
    @CsvFileSource(resources = "hashTableArrayTestGet.csv")
    void getTest(String fillData, String input, String expected) {
        StringBuilder fill = new StringBuilder(fillData.replaceAll(" ", ""));

        fill.delete(0, 1);
        fill.delete(fill.length()-1, fill.length());

        String[] fillList = fill.toString().split(";");
        String[] keys = input.replaceAll(" ", "").split(";");
        String[] expectedValues = expected.replaceAll(" ", "").split(";");

        for (String s : fillList) {
            String[] keyVal = s.split("=");
            hashTableArray.put(keyVal[0], keyVal[1]);
        }

        for (int i = 0; i < keys.length; i++) {
            assertEquals(hashTableArray.get(keys[i]), expectedValues[i]);
        }
    }

    @ParameterizedTest(name = "Hash table remove general tests")
    @CsvFileSource(resources = "hashTableArrayTestRemoveResult.csv")
    void removeTestResult(String fillData, String input, String expected) {
        StringBuilder fill = new StringBuilder(fillData.replaceAll(" ", ""));

        fill.delete(0, 1);
        fill.delete(fill.length()-1, fill.length());
        String[] fillList = fill.toString().split(";");
        String[] keys = input.replaceAll(" ", "").split(";");

        for (String s : fillList) {
            String[] keyVal = s.split("=");
            hashTableArray.put(keyVal[0], keyVal[1]);
        }

        for (String s : keys) {
            hashTableArray.remove(s);
        }

        assertEquals(hashTableArray.toString(), expected);
    }

    @ParameterizedTest(name = "Hash table returns values tests")
    @CsvFileSource(resources = "hashTableArrayTestRemoveElement.csv")
    void removeTestElement(String fillData, String input, String expected) {
        StringBuilder fill = new StringBuilder(fillData.replaceAll(" ", ""));

        fill.delete(0, 1);
        fill.delete(fill.length()-1, fill.length());

        String[] fillList = fill.toString().split(";");
        String[] keys = input.replaceAll(" ", "").split(";");
        String[] expectedValues = expected.replaceAll(" ", "").split(";");

        for (String s : fillList) {
            String[] keyVal = s.split("=");
            hashTableArray.put(keyVal[0], keyVal[1]);
        }

        for (int i = 0; i < keys.length; i++) {
            assertEquals(hashTableArray.remove(keys[i]), expectedValues[i]);
        }
    }
}
