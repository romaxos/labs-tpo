package thirdTask;

public class God {
    private String name;
    private boolean isExists;

    public God (String name, boolean isExists) {
        this.name = name;
        this.isExists = isExists;
    }

    public String getName() {
        return name;
    }

    public boolean getIsExists() {
        return isExists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExists(boolean exists) {
        isExists = exists;
    }

    public void printStatusGod() {
        if (this.isExists) {
            System.out.println("Бог существует!");
        } else {
            System.out.println("Бог не существует!");
        }
    }
}
