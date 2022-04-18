package thirdTask;

public class Discussion {
    private final Discussing peopleForGod;
    private final Discussing peopleForScince;

    public Discussion(Discussing peopleForGod, Discussing peopleForScince) {
        this.peopleForGod = peopleForGod;
        this.peopleForScince = peopleForScince;
    }



    public double calcVer(Discussing discussing, boolean onScince) {
        double sumVerForGod = 1;
        double sumVerNoForGod = 1;
        for (Proof proof: discussing.getProofs()) {
            if (proof.getForGod()) {
                sumVerForGod *= proof.getUncommonEssence().getProbabilityOfExistence();
            } else {
                sumVerNoForGod *= proof.getUncommonEssence().getProbabilityOfExistence();
            }
        }
        return onScince ? sumVerNoForGod : sumVerForGod;
    }

    public int calcCount(Discussing discussing, boolean onScince) {
        int countForGod = 0;
        int countForScince = 0;
        for (Proof proof: discussing.getProofs()) {
            if (proof.getForGod()) {
                countForGod++;
            } else {
                countForScince++;
            }
        }
        return onScince ? countForScince : countForGod;
    }

    public boolean doDiscuss(Discussing peopleForGod, Discussing peopleForScince) {
        double resForGod = calcVer(peopleForGod, false) * calcCount(peopleForGod,false);
        double resForScince = calcVer(peopleForScince, true) * calcCount(peopleForScince, false);
        return resForGod <= resForScince;
    }

}
