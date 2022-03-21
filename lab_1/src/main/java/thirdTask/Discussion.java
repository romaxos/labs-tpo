package thirdTask;

public class Discussion {
    Discussing peopleForGod;
    Discussing peopleForScince;


    public boolean doDiscuss(Discussing peopleForGod, Discussing peopleForScince) {
        double sumVerFirst = 1;
        double sumVerSecond = 1;
        StringBuilder infoForGod = new StringBuilder("Исходя из невероятного совпадения такой маленькой случайности существования: ");
        StringBuilder infoForScience = new StringBuilder("Исходя из невероятного совпадения такой маленькой случайности существования: ");

        for (Proof proof: peopleForGod.getProofs()) {
            sumVerFirst *= proof.getUncommonEssence().getProbabilityOfExistence();
            infoForGod.append(proof.getUncommonEssence().getTitle());
        }

        for (Proof proof: peopleForScince.getProofs()) {
            sumVerSecond *= proof.getUncommonEssence().getProbabilityOfExistence();
            infoForScience.append(proof.getUncommonEssence().getTitle());

        }

        if (sumVerFirst < sumVerSecond) {
            System.out.println(infoForGod);
            return true;
        } else {
            System.out.println(infoForScience);
            return false;
        }
    }



}
