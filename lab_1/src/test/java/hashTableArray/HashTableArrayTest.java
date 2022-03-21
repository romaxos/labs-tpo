package hashTableArray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import secondTask.HashTableArray;

import java.util.Arrays;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("HashTable tests")
public class HashTableArrayTest {


    // containsKey проверяет есть ли обьект с таким ключем
    // containsValue тоже есть
    @ParameterizedTest(name = "test one")
    @CsvFileSource(resources = "/hashTable/hashTable.csv")
    void test(String text) {
        text = text.replaceAll(" ", "");
        String[] a = text.split(";");
        System.out.println(Arrays.toString(a));
    }
}
