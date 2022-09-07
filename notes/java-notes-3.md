# Herança e polimorfismo

> `Pessoa.java`

```java
public Pessoa {
  private String nome;
  private String apelido;
  private int idade;
  private double altura;

  // construtor
  //...

  // getters and setters
  //...

  // métodos
  public String whoAmI() {
    return "Eu sou uma Pessoa";
  }
}
```

> `Aluno.java`
```java
public Aluno extends Pessoa {

  private String RA;
  private double notaFinal;

  // construtores + contrutores herdados

  // métodos
  @Override
  public String whoAmI(){
    return "Eu sou uma Pessoa e um Aluno";
  }
}
```