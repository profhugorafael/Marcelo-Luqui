# Criando classes

```java

class Aluno {
  // atributos
  String nome;
  int idade;
  String telefone;
  double altura;
  double media;

}

public class Program {
  // ...
}
```

## Instanciando um aluno

Criar uma variável do tipo aluno.

```java
  Aluno maria = new Aluno();
  Aluno pedro;
  pedro = new Aluno();
```

## Acessando os atributos

Podemos acessar, por enquanto, os atributos tanto para alteração quando para consulta.

```java
  Aluno joao = new Aluno();

  joao.nome = "Joao da Silva";
  joao.idade = 16;
  joao.altura = 1.70;

  System.out.println(joao.nome);
  System.out.println(joao.idade);
  System.out.println(joao.altura);
```

## Métodos

Análogo a função, porém é a função que pertence a alguma classe.

```java

class Aluno {
  
  // atributos
  public String nome;
  public int idade;
  public String telefone;
  public double altura;
  public double media;

  // construtores
  public Aluno() {
  }

  public Aluno(String n, int i, double a) {
    nome = n;
    idade = i;
    altura = a;
  }

  // métodos
  public int somar(int a, int b) {
    return a+b;
  }

  public void fazerAniversario() {
    idade++; // somar um na idade
  }

}

```

Usando o método:
```java
  Aluno joao = new Aluno();
  joao.idade = 16;

  System.out.println( joao.somar(2, 3) );

  System.out.println( joao.idade );
  joao.fazerAniversario();

  System.out.println( joao.idade );
```
