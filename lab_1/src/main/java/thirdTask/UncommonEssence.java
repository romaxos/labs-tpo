package thirdTask;

/* неизведанная сущность */
public class UncommonEssence {
    private final String title;
    private final double probabilityOfExistence;



    public UncommonEssence(String title, double probabilityOfExistence) {
        this.title = title;
        this.probabilityOfExistence = validateProb(probabilityOfExistence);
    }

    private double validateProb(double probabilityOfExistence) {
        if (probabilityOfExistence < 0) {
            return 0.0;
        } else if (probabilityOfExistence > 1){
            return 1.0;
        }
        return probabilityOfExistence;
    }

    public double getProbabilityOfExistence() {
        return probabilityOfExistence;
    }

}
