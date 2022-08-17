# Introdução ao java

## Saídas

`Program.java`
```java
public class Program {
  public static void main(String[] args){
    System.out.println("Hello World!");
  }
}
```

## Variáveis

```java
int a = 2;
// long l = 2L;

// float f = 2.3f;
double d = 2.3;

// char c = 'x';
String s = "minha frase";
```

```java
int a = 2, b = 3;
System.out.println( "A soma é: " + (a + b) );
```

## Array (Vetores)

### modelando sem POO
```java
String[] nomes = new String[10];
String[] telefones = new String[10];
int[] idades = new int[10];
double[] medias = new double[10];
```

### Trocando variáveis 
```java
int a = 2, b = 3;
int aux = a;
a = b;
b = aux;
```

Aluno joao;
Aluno maria;

Aluno aux = joao;
joao = maria;
maria = aux;