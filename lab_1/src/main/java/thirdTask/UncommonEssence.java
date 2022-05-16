package thirdTask;

/* неизведанная сущность */
public class UncommonEssence {
    private final String title;
    private final double probabilityOfExistence;



    public UncommonEssence(String title, double probabilityOfExistence) {
        this.title = title;
        this.probabilityOfExistence = validateProb(probabilityOfExistence);
    }

    public double validateProb(double probabilityOfExistence) {
        if (probabilityOfExistence < 0 || probabilityOfExistence > 1) {
            throw new IllegalArgumentException("probability must be between 0 and 1");
        }
        return probabilityOfExistence;
    }

    public double getProbabilityOfExistence() {
        return probabilityOfExistence;
    }

}
