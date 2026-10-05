# Automação de Login com Java, Selenium e Cucumber

Projeto de automação de testes da tela de login do [Sauce Demo](https://www.saucedemo.com), usando BDD.

## Tecnologias
- Java 21
- Selenium WebDriver
- Cucumber (Gherkin em português)
- JUnit 4
- Maven
- Padrão Page Object

## Cenários cobertos
- Login com credenciais válidas
- Login com senha inválida

## Como executar
Pré-requisitos: JDK 21, Maven e Google Chrome instalados.

    mvn test

O relatório HTML é gerado em `target/relatorio-cucumber.html`.

## Estrutura
- `pages`: Page Objects (mapeamento da tela)
- `steps`: Step Definitions e Hooks
- `runner`: executor do Cucumber
- `src/test/resources/features`: cenários em Gherkin