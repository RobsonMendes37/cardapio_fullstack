# Backend da Aplicação de Cardápio

Este é o backend da aplicação de cardápio, responsável por lidar com as requisições relacionadas aos alimentos do cardápio.

## Tecnologias Utilizadas

- **Java com Spring Boot**: Desenvolvimento eficiente do backend.
- **Spring Data JPA**: Facilita a interação com o banco de dados relacional.
- **Lombok**: Reduz a quantidade de código boilerplate.
- **Jakarta Persistence (JPA)**: Mapeamento de objetos Java para o banco de dados.
- **Flyway**: Gerenciamento de migrações de banco de dados.
- **PostgreSQL**: Armazenamento dos dados dos alimentos do cardápio.

## Estrutura do Projeto

- **controller/**: Contém os controladores REST.
- **food/**: Contém as classes relacionadas aos alimentos do cardápio.
- **CardapioApplication.java**: Classe principal.
- **ServletInitializer.java**: Configuração da aplicação como um servlet.

## Requisitos

- JDK (Java Development Kit)
- Maven
- PostgreSQL

## Configuração do Banco de Dados

Execute o seguinte comando SQL para criar a tabela necessária no banco de dados:

```sql
CREATE TABLE foods(
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    price INTEGER NOT NULL,
    image TEXT
);
```

## Execução Local

1. Clone o repositório;
2. Navegue até o diretório do backend;
3. Execute/rode o projeto:

```
CardapioApplication.java
```

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).
