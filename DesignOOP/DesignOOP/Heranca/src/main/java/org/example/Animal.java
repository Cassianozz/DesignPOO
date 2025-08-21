package org.example;

public class Animal {
    private String nome;
    private String raca;
    private String cor;
    private int idade;

    public Animal(String nome, String raca, String cor, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void comer() {

    }

    public void dormir() {

    }

    public void fazerSom() {

    }

    public void locomover() {

    }

    public void voar() {

    }
}
