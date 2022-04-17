package secondTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HashTableArray tests")
class HashTableArrayTest {
    private final int size = 10;
    private HashTableArray hashTableArray;

    @BeforeEach
    void setUp() {
        this.hashTableArray = new HashTableArray(size);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "hashTableArrayTestPut.csv")
    void putTest(String input, String expected) {
        StringBuilder inputData = new StringBuilder(input.replaceAll(" ", ""));
        inputData.delete(0, 1);
        inputData.delete(inputData.length()-1, inputData.length());
        String[] p = inputData.toString().split(";");
        for (int i = 0; i < p.length; i++) {
            String[] keyVal = p[i].split("=");
            hashTableArray.put(keyVal[0], keyVal[1]);
        }
        assertEquals(hashTableArray.myToString(), expected);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "hashTableArrayTestGet.csv")
    void getTest()





}
