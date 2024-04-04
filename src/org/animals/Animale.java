package org.animals;

public abstract class Animale {
    private String type;

    public Animale(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    void dormi(){
         System.out.println("Zzz");
     };
     abstract void verso();
     abstract void mangia();
}
