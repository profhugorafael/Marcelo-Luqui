# Comandos do GIT

## Sumário

## Primeira conexão

### 1. Clonagem

```
git init
```

```
git clone <LINK>
```

###   Conectando Remotamente

```
git init
```

```
git remote add <Nome_na_maquina> <Link_do_github>
```

Por padrão podemos usar:

```
git remote add origin <Link_do_github>
```

## Subindo um projeto

Estágios de um projeto:

0. Arquivos não *trackeados*
  Arquivos ainda não registrados no processo de git.
1. Fora da zona de stage
  Arquivos recém criados
2. Arquivos no stage para serem commitados
  Depois de adicionar os arquivos no stage, podemos commitar
3. Commit
   Checkpoint com uma etiqueta
4. Push
   Do stage pro público.

Vai pegar tudo que foi alterado

```
  git add .
```

Também podemos passar uma pasta, ou arquivo em especifico

```
  git commit -m "o nome/mensagem do seu checkpoint"
```

Por último subimos as atualizações da maquina para o github:
(Supondo conexão remota com nome `origin` e subindo pra branch `master`)
```
  git push -u origin master
```

## Puxando atualizações de um projeto

Em casos onde não há conflito de arquivos

Supondo que o nome da conexão seja `origin`

```
git pull origin master
```