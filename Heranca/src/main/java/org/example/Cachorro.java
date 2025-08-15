package org.example;

public class Cachorro extends Animal {
    public Cachorro(String nome, String raca, String cor, int idade) {
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
        System.out.println("cachorro late");
    }

    @Override
    public void locomover() {
        System.out.println("cachorro late");
    }
}
