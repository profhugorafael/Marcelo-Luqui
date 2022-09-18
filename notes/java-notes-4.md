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

```java
public interface Crud<T> {
  void create(T t);
  List<T> readAll();
  T update(T t);
  void delete(T t);
}
```

```java
public class User implements Crud<User> {
  @Override
  public void create(User t){
    // ...
  }

  @Override
  public List<User> readAll(){
    // ...
  }

  @Override
  public User update(User t){
    // ...
  }
  
  @Override
  public void delete(User t){
    // ...
  }
}
```