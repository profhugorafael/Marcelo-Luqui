# Listas

## Ordenações

Para que uma lista de um tipo(de uma classe) seja ordenável, o tipo](a classe) da lista deve ser comparável.

```java
public class Aluno implements Comparable<Aluno>{
  //...
}
```
A interface `Comparable<T>` cria um contrato a ser cumprido pela classe, obrigando que ela implemente o método `CompareTo(T other)`

## Tipos genéricos `<T>`

Tipos genéricos são incados para falar que o tipo de um atributo, retorno de um método ou parâmetro de um método possui flexibilidade entre os tipos.

Sobre classes que usam tipos genéricos:

* **possui flexibilidade inicial**: *podemos criar uma lista de um tipo T*
* **são estaticamente tipados**: o tipo da lista não pode alterar depois de criada