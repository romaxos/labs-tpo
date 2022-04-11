import firstTask.MyFunc;
import secondTask.HashTableArray;
import thirdTask.*;

import java.util.Hashtable;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
//        God god = new God("GOD", false);
//        UncommonEssence magicianFish = new UncommonEssence("Магическая рыба", 0.2);
//        UncommonEssence lolBird = new UncommonEssence("Магическая рыба", 0.1);
//
//        Proof proofForGod = new Proof(magicianFish, true);
//        Proof proofForScience = new Proof(lolBird, false);
//
//        Discussing forGod = new Discussing("Aposel", 23);
//        Discussing forScience = new Discussing("Kent", 34);
//
//        forGod.addProof(proofForGod);
//        forScience.addProof(proofForScience);
//
//        Discussion discussion = new Discussion();
//        god.setExists(discussion.doDiscuss(forGod, forScience));
//
//        god.printStatusGod();
        HashTableArray h = new HashTableArray(10);
        h.put("ggg", "2");
        h.put("efee", "3");
        h.put("e3e", "3");
        h.put("e1e", "3");
        h.put("fffffeee", "3");
        h.put("efwefwe", "3");
        h.put("yyy", "5");
        System.out.println(h.myToString());


    }
}
