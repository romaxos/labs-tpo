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
        h.put("1", "1");
        h.put("2", "2");
        h.put("3", "3");
        h.put("4", "4");
        h.put("5", "5");
        h.put("6", "6");
        h.put("7", "7");
        h.put("8", "8");
        h.put("9", "9");
        h.put("10", "10");
        h.remove("2");
        h.remove("4");
        h.remove("6");
        h.remove("8");
        h.remove("10");



        System.out.println(h.myToString());


    }
}
