# Exemplos de interfaces

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