package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dormir dormirCavalo = new Dormir();
        Respirar respirarCavalo = new Respirar();
        EmitirSom emitirSomCavalo = new EmitirSom();

        Cavalo cavalo = new Cavalo(dormirCavalo, respirarCavalo, emitirSomCavalo);

        cavalo.domir();

        Dormir dormirCoruja = new Dormir();
        Respirar respirarCoruja = new Respirar();
        Voar voarCoruja = new Voar();

        Coruja coruja = new Coruja(dormirCoruja, respirarCoruja, voarCoruja);

        coruja.dormir();
    }
}