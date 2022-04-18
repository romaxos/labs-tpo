package thirdTask;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "God tests")
public class GodTest {

    @Test
    void normalStatusGod() {
        God god1 = new God("Big God", true);
        God god2 = new God("Small God", false);
        assertEquals("Бог существует!", god1.normalStatusGod());
        assertEquals("Бог не существует!", god2.normalStatusGod());
    }
}
