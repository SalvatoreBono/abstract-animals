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
                faiVolare((IFly) animal);
                //altrimenti sarà un animale che implementa ISwim
            }else {
                faiNuotare((ISwim) animal);
            }
            System.out.println("----------------");
        }
    }

    public static void faiVolare(IFly animale){
            animale.fly();
    }

    public static void faiNuotare(ISwim animale){
            animale.swim();
    }
}
