package thirdTask;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

@DisplayName(value = "Discussion tests")
public class DiscussionTest {

    private UncommonEssence magFish;
    private UncommonEssence lolBird;
    private Proof proofMagFish;
    private Proof proofLolbird;
    private ArrayList<Proof> listFirstDis;
    private ArrayList<Proof> listSecondDis;
    private Discussing discussing1;
    private Discussing discussing2;
    private Discussion discussion;

    @BeforeEach
    void setUp() {
        this.magFish = new UncommonEssence("Магическая рыба", 0.2);
        this.lolBird = new UncommonEssence("Магическая птица", 0.1);
        this.proofMagFish = new Proof(magFish, true);
        this.proofLolbird = new Proof(lolBird, false);
        this.listFirstDis = new ArrayList<>();
        this.listSecondDis = new ArrayList<>();
        this.discussing1 = new Discussing("Scala", 23);
        this.discussing2 = new Discussing("Hops", 98);
        this.discussion = new Discussion(discussing1, discussing2);


    }

    @Test
    void calcVerTest() {
        listFirstDis.add(proofMagFish);
        listSecondDis.add(proofLolbird);
        discussing1.setProofs(listFirstDis);
        discussing2.setProofs(listSecondDis);
        assertEquals(0.2, discussion.calcVer(discussing1, false));
        assertEquals(0.1, discussion.calcVer(discussing2, true));
        assertEquals(1.0, discussion.calcVer(discussing1, true));
        assertEquals(1.0, discussion.calcVer(discussing2, false));


    }

    @Test
    void calcCountTest() {
        listFirstDis.add(proofMagFish);
        listSecondDis.add(proofLolbird);
        discussing1.setProofs(listFirstDis);
        discussing2.setProofs(listSecondDis);
        assertEquals(1, discussion.calcCount(discussing1, false));
        assertEquals(1, discussion.calcCount(discussing2, true));
        assertEquals(0, discussion.calcCount(discussing1, true));
        assertEquals(0, discussion.calcCount(discussing2, false));
    }


    @Test
    void doDiscussTest() {
        listFirstDis.add(proofMagFish);
        listSecondDis.add(proofLolbird);
        discussing1.setProofs(listFirstDis);
        discussing2.setProofs(listSecondDis);
        assertFalse(discussion.doDiscuss(discussing1, discussing2));
        assertTrue(discussion.doDiscuss(discussing2, discussing1));
    }
}
