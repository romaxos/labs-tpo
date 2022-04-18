package thirdTask;

public class God {
    private final String name;
    private final boolean isExists;

    public God(String name, boolean isExists) {
        this.name = name;
        this.isExists = isExists;
    }

    public String normalStatusGod() {
        return this.isExists ? "Бог существует!" : "Бог не существует!";
    }
}
