import firstTask.MyFunc;
import thirdTask.*;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        God god = new God("GOD", false);
        UncommonEssence magicianFish = new UncommonEssence("Магическая рыба", 0.2);
        UncommonEssence lolBird = new UncommonEssence("Магическая рыба", 0.1);

        Proof proofForGod = new Proof(magicianFish, true);
        Proof proofForScience = new Proof(lolBird, false);

        Discussing forGod = new Discussing("Aposel", 23);
        Discussing forScience = new Discussing("Kent", 34);

        forGod.addProof(proofForGod);
        forScience.addProof(proofForScience);

        Discussion discussion = new Discussion();
        god.setExists(discussion.doDiscuss(forGod, forScience));

        god.printStatusGod();
    }
}