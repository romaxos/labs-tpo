package thirdTask;

/* неизведанная сущность */
public class UncommonEssence {
    private String title;
    private double probabilityOfExistence;

    public UncommonEssence(String title, double probabilityOfExistence) {
        this.title = title;
        this.probabilityOfExistence = probabilityOfExistence;
    }


    public String getTitle() {
        return title;
    }

    public double getProbabilityOfExistence() {
        return probabilityOfExistence;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setProbabilityOfExistence(double probabilityOfExistence) {
        this.probabilityOfExistence = probabilityOfExistence;
    }


}
