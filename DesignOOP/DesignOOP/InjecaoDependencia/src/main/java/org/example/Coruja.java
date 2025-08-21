package org.example;

public class Coruja {
    private final Dormir dormir;
    private final Respirar respirar;
    private final Voar voar;

    public Coruja(Dormir dormir, Respirar respirar, Voar voar) {
        this.dormir = dormir;
        this.respirar = respirar;
        this.voar = voar;
    }

    public void dormir() {
        this.dormir.dormir("coruja");
    }
}
