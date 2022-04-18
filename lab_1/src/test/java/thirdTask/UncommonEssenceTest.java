package thirdTask;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Uncommon essence tests")
public class UncommonEssenceTest {

    @Test
    void validateProbTest() {
        UncommonEssence uncommonEssence1 = new UncommonEssence("One", 0.0);
        UncommonEssence uncommonEssence2 = new UncommonEssence("Two", 1.0);
        UncommonEssence uncommonEssence3 = new UncommonEssence("Three", 0.5);
        UncommonEssence uncommonEssence4 = new UncommonEssence("Four", 1.1);
        UncommonEssence uncommonEssence5 = new UncommonEssence("Five", -1.5);
        assertEquals(0.0, uncommonEssence1.getProbabilityOfExistence());
        assertEquals(1.0, uncommonEssence2.getProbabilityOfExistence());
        assertEquals(0.5, uncommonEssence3.getProbabilityOfExistence());
        assertEquals(1.0, uncommonEssence4.getProbabilityOfExistence());
        assertEquals(0.0, uncommonEssence5.getProbabilityOfExistence());
    }


}
