package org.animals;

public class Cane extends Animale implements ISwim{
    public Cane(String type) {
        super(type);
    }

    @Override
    void verso() {
        System.out.println("Verso: abbaia");
    }

    @Override
    void mangia() {
        System.out.println("Mangia: carne, pesce, tuorlo d'uovo, formaggi freschi, verdure e carboidrati come pasta o riso cotti.");
    }

    @Override
    public void swim() {
        System.out.println("Nuota");
    }
}
