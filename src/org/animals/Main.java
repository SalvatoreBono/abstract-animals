package org.animals;

public class Main {
    public static void main(String[] args) {
        Animale[] animals = {new Aquila("Aquila"),new Cane("Cane"),new Delfino("Delfino"),new Passerotto("Passerotto")};
        for (Animale animal : animals){
            System.out.println(animal.getType());
            animal.verso();
            animal.mangia();
            animal.dormi();
            //controlla se l'animale implementa IFly
            if (animal instanceof IFly){
                faiVolare(animal);
                //altrimenti sarà un animale che implementa ISwim
            }else {
                faiNuotare(animal);
            }
            System.out.println("----------------");
        }
    }

    public static void faiVolare(Animale animale){
            ((IFly) animale).fly();
    }

    public static void faiNuotare(Animale animale){
            ((ISwim) animale).swim();
    }
}
