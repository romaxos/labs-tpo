package thirdTask;

import java.util.ArrayList;
import java.util.List;

public class Discussing {
    private final String name;
    private final int age;
    private List<Proof> proofs;


    public Discussing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Proof> getProofs() {
        return proofs;
    }

    public void setProofs(List<Proof> proofs) {
        this.proofs = proofs;
    }

}
