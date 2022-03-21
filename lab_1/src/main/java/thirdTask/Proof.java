package thirdTask;

public class Proof {
    private UncommonEssence uncommonEssence;
    private boolean forGod;

    public Proof(UncommonEssence uncommonEssence, boolean forGod) {
        this.uncommonEssence = uncommonEssence;
        this.forGod = forGod;
    }

    public UncommonEssence getUncommonEssence() {
        return uncommonEssence;
    }

    public boolean getChance() {
        return forGod;
    }

    public void setUncommonEssence(UncommonEssence uncommonEssence) {
        this.uncommonEssence = uncommonEssence;
    }

    public void setChance(boolean forGod) {
        this.forGod = forGod;
    }
}
