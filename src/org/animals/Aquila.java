package org.animals;

public class Aquila extends Animale implements IFly{

    public Aquila(String type) {
        super(type);
    }

    @Override
    void verso() {
        System.out.println("Verso: strida");
    }

    @Override
    void mangia() {
        System.out.println("Mangia: mammiferi ed uccelli, a seconda delle zone. In certe zone anche di rettili");
    }

    @Override
    public void fly() {
        System.out.println("Vola");
    }
}
