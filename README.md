# Akasha

Um catálogo pessoal de animes desenvolvido em Java 21 e Spring Boot, com foco na aplicação de padrões de projeto. O projeto utiliza Factory Method para a criação de objetos e Strategy para implementar diferentes formas de ordenação de animes.

## Requisitos

- JDK 21
- Apache Maven

## Configuração

Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO
cd akasha
```

## Execução

Execute a aplicação utilizando o Maven Wrapper.

No Windows:

```bash
.\mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

## Como executar os exemplos

1. Certifique-se de ter o JDK 21 instalado.
2. Clone o repositório e entre na pasta do projeto.
3. Execute a aplicação utilizando o Maven Wrapper, conforme as instruções da seção **Execução**.

Após a implementação da demonstração, os exemplos serão executados no terminal, permitindo observar a criação de animes com o padrão Factory Method e a ordenação com o padrão Strategy.

## Padrões de projeto

### Factory Method

Centraliza a criação de objetos do tipo `Anime`, separando a lógica de instanciação do restante da aplicação.

### Strategy

Permite implementar diferentes estratégias de ordenação para os animes, como por nome ou avaliação, mantendo as regras de ordenação separadas.

## Estrutura do projeto

```text
src/main/java/br/com/akasha/
├── model/
│   ├── Titulo.java
│   └── Anime.java
├── factory/
│   ├── CriadorTitulo.java
│   └── CriadorAnime.java
└── strategy/
    └── EstrategiaOrdenacao.java
```

## Desenvolvimento

O Akasha está em desenvolvimento e tem como objetivo demonstrar a aplicação prática de padrões de projeto em Java.

## Funcionalidades futuras

- Cadastro e organização de animes.
- Avaliações e favoritos.
- Acompanhamento de animes assistidos.
