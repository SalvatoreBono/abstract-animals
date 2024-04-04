package org.animals;

public class Delfino extends Animale implements ISwim{
    public Delfino(String type) {
        super(type);
    }

    @Override
    void verso() {
        System.out.println("Verso: click, burst pulsed sound e i fischi");
    }

    @Override
    void mangia() {
        System.out.println("Mangia: pesci e molluschi (seppie, calamari, polpi e moscardini)");
    }

    @Override
    public void swim() {
        System.out.println("Nuota");
    }
}
