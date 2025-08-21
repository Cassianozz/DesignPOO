package org.example;

public class Cavalo {

    private final Dormir dormir;
    private final Respirar respirar;
    private final EmitirSom emitirSom;

    public Cavalo(Dormir dormir, Respirar respirar, EmitirSom emitirSom) {
        this.dormir = dormir;
        this.respirar = respirar;
        this.emitirSom = emitirSom;
    }

    public void domir() {
        this.dormir.dormir("cavalo");
    }

    public void emitirSom() {
        this.emitirSom.emitirSom("cavalo");
    }
}
