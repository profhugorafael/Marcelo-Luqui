# Checklist de criação de projetos Spring

## 1. Spring Initializr

O `IntelliJ` Fornece ele integrado a criação do projeto, mas caso não seja fornecido você pode acessar diretamente o site:

* [Spring Initializr](https://start.spring.io)

Nele você poderá construir seu projeto Spring.

No exemplo escolheremos:

* Java 17
* Maven 
* Spring Boot 2.7.4
* Packing `.jar`
  
No campo **Group** colocamos o domínio invertido, e no **Artifact** colocamos o nome da ferramenta que estamos desenvolvendo. Por exemplo, caso estivéssemos desenvolvendo uma ferramenta de pesquisa para a google:

* Group: `com.google`
* Artifact: `searchtool`

Automaticamente o **Package Name** deve sair: `com.google.searchtool`

## 2. Dependências

No nosso projeto Spring iremos evitar abstrações e focar nas implementações, isto é, colocamos outras ferramentas já implementadas para uso.

Para o nosso modelo REST:

* Spring Web

Para o banco de dados precisamos adicionar um connector ou usar o banco em memória do Java:

* H2 (Banco em memória do Java)
* MySQl Driver
* PostgreSQL Driver
* MariaDB Driver

Para estes bancos relacionais usamos uma versão do JPA dedicada a trabalhar com o Spring, adicione:

* Spring Data JPA

Para não relacionais são fornecidas ORM's próprias.

Após isso existem algumas dependências que podem nos ajudar durante o desenvolvimento como:

* Lombok
* Devtools

A Lombok já teve algumas falhas de segurança, porém com o avanço da depência foi se tornando mais segura e amplamente utilizada, pois evita muito código *`boiler plate`*, isto é repetitivo e semelhante. **Pode exigir configuração dependendo da IDE**

A DevTools serve para nos ajudar com LiveReload a cada atualização no código.

> **Não recomendo que coloque todas as dependências da versão final de uma única vez, isto irá dificultar os primeiros testes.**

## 3. Configurando o projeto

* Baixe o projeto em `.zip`
* Descompacte o arquivo em uma pasta local
* Vá na IDE, procure pela pasta do projeto e abra

Procure pelo arquivo `pom.xml`:
* cheque suas depedências e versões utilizadas.
* Neste arquivo você poderá adicionar futuras dependências

**`application.properties`:**

Neste arquivo iremos configurar alguns valores para serem usados durante a ativação do servidor:

Criando um perfil de teste:

```
spring.profiles.active=test
springjpa.open-in-view=true
```