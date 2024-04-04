package org.animals;

public class Passerotto extends Animale implements IFly{
    public Passerotto(String type) {
        super(type);
    }

    @Override
    void verso() {
        System.out.println("Verso: cinguetta");
    }

    @Override
    void mangia() {
        System.out.println("Mangia: fiocchi d'avena, noci e nocciole, uvette e frutta");
    }

    @Override
    public void fly() {
        System.out.println("Vola");
    }
}
