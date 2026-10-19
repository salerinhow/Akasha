# Akasha

Um catálogo pessoal de animes desenvolvido em Java 21 e Spring Boot, com foco na aplicação de padrões de projeto. O projeto utiliza Factory Method para a criação de objetos e Strategy para implementar diferentes formas de ordenação de animes.

## Requisitos

- JDK 21
- Apache Maven

## Configuração

Clone o repositório:

```bash
git clone https://github.com/salerinhow/Akasha.git
cd Akasha
```

## Execução

Execute a aplicação utilizando o Maven Wrapper.

No Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

A aplicação executa uma demonstração no terminal, exibindo os animes ordenados por nome e por avaliação.

## Testes

Para executar os testes automatizados no Windows:

```powershell
.\mvnw.cmd test
```

No Linux ou macOS:

```bash
./mvnw test
```

## Padrões de projeto

### Factory Method

Centraliza a criação de objetos do tipo `Anime`, separando a lógica de instanciação do restante da aplicação.

### Strategy

Permite implementar diferentes estratégias de ordenação para os animes, como por nome ou avaliação, mantendo as regras de ordenação separadas.

## Integração com Spring Boot

A aplicação utiliza componentes gerenciados pelo Spring Framework e injeção de dependências por construtor, reduzindo a necessidade de instanciação manual dos componentes.

## Estrutura do projeto

```text
src/main/java/br/com/akasha/
├── AkashaApplication.java
├── DemonstracaoAkasha.java
├── model/
│   ├── Titulo.java
│   └── Anime.java
├── factory/
│   ├── CriadorTitulo.java
│   └── CriadorAnime.java
├── strategy/
│   ├── EstrategiaOrdenacao.java
│   ├── OrdenarPorNome.java
│   └── OrdenarPorAvaliacao.java
└── service/
    └── CatalogoAnime.java
```

## Desenvolvimento

Projeto desenvolvido como parte do Bootcamp Java com IA, da DIO, com o objetivo de aplicar na prática os conceitos de padrões de projeto em Java e explorar os recursos do Spring Boot.

A implementação utiliza os padrões Factory Method e Strategy, além de injeção de dependências para organizar os componentes da aplicação.
