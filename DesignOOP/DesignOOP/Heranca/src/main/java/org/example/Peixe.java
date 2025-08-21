package org.example;

public class Peixe extends Animal {
    public Peixe(String nome, String raca, String cor, int idade) {
        super(nome, raca, cor, idade);
    }

    @Override
    public void comer() {
        System.out.println("peixe come");
    }

    @Override
    public void dormir() {
        System.out.println("peixe dorme");
    }

    @Override
    public void fazerSom() {
        System.out.println("peixe dorme");
    }
}
