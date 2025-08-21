package org.example;

public class Coruja {
    private final Dormir dormir;
    private final Respirar respirar;
    private final Voar voar;

    public Coruja() {
        this.dormir = new Dormir();
        this.respirar = new Respirar();
        this.voar = new Voar();
    }

    public void dormir() {
        this.dormir.dormir("coruja");
    }
}
