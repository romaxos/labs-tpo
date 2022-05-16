package thirdTask;


import org.junit.jupiter.api.BeforeEach;
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
        assertEquals(0.0, uncommonEssence1.getProbabilityOfExistence());
        assertEquals(1.0, uncommonEssence2.getProbabilityOfExistence());
        assertEquals(0.5, uncommonEssence3.getProbabilityOfExistence());
        assertEquals(0.2, uncommonEssence1.validateProb(0.2));
        assertEquals(0.6, uncommonEssence1.validateProb(0.6));
        assertEquals(0.8, uncommonEssence1.validateProb(0.8));
    }

    @Test
    void ExceptionValidateProb() {
        UncommonEssence uncommonEssence = new UncommonEssence("fish", 0.1);
        assertThrows(IllegalArgumentException.class, () -> {
            uncommonEssence.validateProb(1.1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            uncommonEssence.validateProb(-1.1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            uncommonEssence.validateProb(100.0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            uncommonEssence.validateProb(-100.0);
        });

    }

}
