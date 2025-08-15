package org.example;

public class Cavalo extends Animal {
    public Cavalo(String nome, String raca, String cor, int idade) {
        super(nome, raca, cor, idade);
    }

    @Override
    public void comer() {
        System.out.println("cachorre come");
    }

    @Override
    public void dormir() {
        System.out.println("cachorro dorme");
    }

    @Override
    public void fazerSom() {
        System.out.println("cachorro relincha");
    }
}
