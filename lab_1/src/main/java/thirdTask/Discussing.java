package thirdTask;

import java.util.ArrayList;

public class Discussing {
    private String name;
    private int age;
    private ArrayList<Proof> proofs;


    public Discussing(String name, int age) {
        this.name = name;
        this.age = age;
        proofs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Proof> getProofs() {
        return proofs;
    }

    public void setProofs(ArrayList<Proof> proofs) {
        this.proofs = proofs;
    }

    public void addProof (Proof p) {
        this.proofs.add(p);
    }

    public void deleteProof(Proof p) {
       this.proofs.remove(p);
    }
}
