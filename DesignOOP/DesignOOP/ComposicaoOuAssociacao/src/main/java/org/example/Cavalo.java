package org.example;

public class Cavalo {

    private final Dormir dormir;
    private final Respirar respirar;
    private final EmitirSom emitirSom;

    public Cavalo() {
        this.dormir = new Dormir();
        this.respirar = new Respirar();
        this.emitirSom = new EmitirSom();
    }

    public void domir() {
        this.dormir.dormir("cavalo");
    }

    public void emitirSom() {
        this.emitirSom.emitirSom("cavalo");
    }
}
