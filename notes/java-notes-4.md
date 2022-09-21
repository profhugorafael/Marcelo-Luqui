# Keywords em Herança

## `extends`

Indica a classe que classe é uma continuação de outra classe, herdando seus atributos e métodos

```java
public class Aluno extends Pessoa {
 // ...
}
```

## `final`

Bloqueia alterações da variável no programa e nas relações de herança.

* Métodos com a palavra final não podem sofrer sobreescrição(`@Override`)
  
## Classe Abstrata

Uma classe que não produz objetos e só serve para ser extendida e criar contratos através de seus métodos.

# Interfaces

Toda interface é uma classe abstrata, porém através desta sintaxe conseguimos um melhor uso.

Interfaces permitem implementações múltiplas, diferente das heranças. (A classe que implementa sempre sobreescreve os métodos)