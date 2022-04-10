package secondTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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
        
    }





}
