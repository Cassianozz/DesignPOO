# 🧬 Herança em Java

A **herança** é um dos pilares da **Programação Orientada a Objetos (POO)**.  
Ela vai permitir que uma classe filha (**subclasse**) reutilize atributos e métodos da classe pai (**superclasse**).  

Isso resulta em **reutilização de código** e melhor **organização hierárquica**.

---
## ✅ Vantagens da Herança
- **Reutilização de código** → evita duplicação ao reaproveitar atributos e métodos.  
- **Organização hierárquica** → classes podem ser estruturadas de forma mais clara.  
- **Polimorfismo** → permite usar objetos de subclasses como se fossem da superclasse.  

---

## ⚠️ Desvantagens da Herança
- **Aumento do acoplamento** → subclasses ficam fortemente ligadas à superclasse, podendo gerar erros em alterações futuras.  
- **Dificuldade de manutenção** → mudanças na superclasse podem quebrar facilmente as subclasses.  
- **Uso limitado** → nem sempre a herança é a melhor opção; em muitos casos, a **composição** é preferível, pois traz maior flexibilidade e menor acoplamento.  

---

## 🔹 Exemplo Simples em Java

```java
// Superclasse (Classe Pai)
class Animal {
    String nome;

    void comer() {
        System.out.println(nome + " está se alimentando...");
    }
}

// Subclasse (Classe Filha) herdando de Animal
class Cachorro extends Animal {
    void latir() {
        System.out.println(nome + " está latindo alto!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.nome = "Rex";

        dog.comer(); // Método herdado da superclasse
        dog.latir(); // Método da subclasse
    }
}


# Associação em Java

## 📌 Associação
É a relação entre duas classes, onde uma utiliza a outra, mas **não existe dependência** entre elas.  
Ou seja, uma classe pode existir sem a outra.

### Exemplo em Java:
```java
class Cachorro {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Dono {
    private String nome;

    public Dono(String nome) {
        this.nome = nome;
    }

    public void mandar(Cachorro cachorro) {
        System.out.println(nome + " está ensinando " + cachorro.getNome());
    }
}

public class Main {
    public static void main(String[] args) {
        Dono dono = new Dono("Cassiano");
        Cachorro cachorro = new Cachorro("Gabriel");

        dono.mandar(cachorro); // Associação: Dono se relaciona com Cachorro
    }
}

| Conceito       | Característica                                                                              | Exemplo         |
| -------------- | ------------------------------------------------------------------------------------------- | --------------- |
| **Associação** | Relação fraca: um objeto pode conhecer o outro, mas não precisa depender dele para existir  | Dono ↔ Cachorro |

---

## ✅ Pontos Positivos
- **Associação:** mais flexível, facilita a reutilização e garante acoplamento fraco.  

---

## ⚠️ Pontos Negativos
- **Associação:** pode gerar acoplamento excessivo se for mal planejada.  


## 📌 Composição
É um tipo de associação em que uma classe depende da outra para continuar existindo.  
Por exemplo: se o objeto "pai" for destruído, o objeto "filho" também será destruído.  
Isso pode resultar em uma quebra de responsabilidade, podendo gerar erros se não for bem planejado.

### Exemplo em Java:
```java
class Motor {
    public void ligar() {
        System.out.println("Motor ligado!");
    }
}

class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor(); // Composição: Carro cria e "possui" Motor
    }

    public void ligarCarro() {
        motor.ligar();
        System.out.println("Carro ligado!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro(); // Motor só existe porque Carro existe
    }
}


| Conceito       | Característica                                                            | Exemplo       |
| -------------- | ------------------------------------------------------------------------- | ------------- |
| **Composição** | Relação forte: um objeto "possui" outro e controla sua existência         | Carro → Motor |

---

## ✅ Pontos Positivos
- **Composição:** organiza melhor a estrutura, garante encapsulamento e clareza na relação de dependência.  

---

## ⚠️ Pontos Negativos
- **Composição:** reduz a flexibilidade, já que o objeto interno depende totalmente do objeto principal.  


# 📌 Injeção de Dependência (Dependency Injection)

A **Injeção de Dependência** é um padrão em que uma classe **não cria suas dependências**, mas **recebe objetos externos** que ela precisa para funcionar.

No código:

- `Cavalo` recebe `Dormir`, `EmitirSom` e `Respirar` via construtor.  
- `Cavalo` **não cria essas classes internamente**, apenas usa os serviços fornecidos.

---

## ✅ Pontos Positivos
- **Desacoplamento:** `Cavalo` não depende de implementações concretas. Você pode trocar `Dormir` ou `EmitirSom` facilmente.  
- **Reutilização:** As classes `Dormir` e `EmitirSom` podem ser usadas por outros animais sem mudar `Cavalo`.  
- **Flexibilidade e manutenibilidade:** Novas funcionalidades podem ser adicionadas sem alterar `Cavalo`.

---

## ⚠️ Pontos Negativos
- **Mais complexidade inicial:** Pode parecer exagerado em sistemas pequenos.  
- **Configuração necessária:** É preciso criar os objetos externos antes de instanciar `Cavalo`.  
- **Dependência de terceiros:** Se a criação das dependências falhar, `Cavalo` não pode ser usado.

---

## 🔹 Por que é recomendável utilizar?
- Para **reduzir acoplamento** entre classes.  
- Para **facilitar testes unitários**.  
- Para deixar o código **mais modular, flexível, fácil de manter e responsivo**.  
- Para **trocar implementações sem precisar alterar** a classe que consome o serviço.
