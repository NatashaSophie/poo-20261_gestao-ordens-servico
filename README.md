# Sistema de Gestao de Ordens de Servico (POO)

Projeto didatico para a disciplina de Programacao Orientada a Objetos (Java). 

Este projeto tem finalidade didática e pode ser livremente utilizado, modificado e adaptado para fins de estudo.

O codigo evolui incrementalmente por aulas e recebe tags no Git:
- Aula 1: criação do projeto, classes iniciais, objetos, atributos, métodos e abstração do domínio. 
- Aula 2: encapsulamento, composição de objetos e métodos com regras simples.
- Aula 3: herança, sobrescrita, polimorfismo e classes abstratas/interfaces.
- Aula 4: exceções, organização em pacotes, introdução a Facade e fechamento do mini sistema.

## Como compilar e executar (Java 17)

```bash
javac -d out src/app/Main.java src/model/*.java src/exception/*.java src/repository/*.java src/service/*.java
java -cp out app.Main
```

Se voce estiver em uma tag anterior, ajuste os pacotes conforme a aula.
