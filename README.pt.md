# GMList - Sistema de Gerenciamento de Listas de Jogos

GMList é uma aplicação RESTful desenvolvida com Spring Boot para gerenciar listas de jogos. O sistema permite catalogar jogos com detalhes como título, ano de lançamento, gênero, plataformas, e classificação, além de organizá-los em listas temáticas.

## 📋 Funcionalidades

- Listagem completa de jogos
- Busca de jogos por ID
- Criação e gerenciamento de listas de jogos
- Consulta de jogos por lista específica
- Organização de jogos em posições específicas dentro de listas

## 🛠️ Tecnologias Utilizadas

- **Spring Boot**: Framework Java para desenvolvimento de aplicações
- **Spring Data JPA**: Para persistência de dados
- **Jakarta Persistence (JPA)**: API de persistência para mapeamento objeto-relacional
- **RESTful API**: Padrão de arquitetura para APIs web
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional
- **Docker**: Plataforma para desenvolvimento, envio e execução de aplicações em contêineres
- **Maven**: Ferramenta de automação de compilação e gerenciamento de dependências
- **Postman**: Plataforma para teste e documentação de APIs

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas:

### 📦 Entidades (Entities)
- `Game`: Representa um jogo com seus atributos
- `GameList`: Representa uma lista de jogos
- `Belonging`: Representa a relação entre um jogo e uma lista, incluindo a posição do jogo na lista
- `BelongingPK`: Chave primária composta para a entidade Belonging

### 🔄 DTOs (Data Transfer Objects)
- `GameDto`: Contém todos os dados de um jogo
- `GameMinDto`: Versão simplificada dos dados de um jogo
- `GameListDto`: Dados de uma lista de jogos

### 📊 Projeções (Projections)
- `GameMinProjection`: Interface para projetar dados específicos em consultas personalizadas

### 🗄️ Repositórios (Repositories)
- `GameRepository`: Interface para operações de persistência de jogos
- `GameListRepository`: Interface para operações de persistência de listas de jogos

### 🔧 Serviços (Services)
- `GameService`: Lógica de negócio relacionada a jogos
- `GameListService`: Lógica de negócio relacionada a listas de jogos

### 🎮 Controladores (Controllers)
- `GameController`: Endpoints da API relacionados a jogos
- `GameListController`: Endpoints da API relacionados a listas de jogos

## 🔌 Endpoints da API

### Jogos

```
GET /games - Retorna a lista de todos os jogos (versão simplificada)
GET /games/{id} - Retorna os detalhes completos de um jogo específico
```

### Listas de Jogos

```
GET /lists - Retorna todas as listas de jogos
GET /lists/{listId}/games - Retorna todos os jogos pertencentes a uma lista específica
```


## 📚 Estrutura do Banco de Dados

O projeto utiliza três tabelas principais:

- **tb_game**: Armazena informações sobre os jogos
- **tb_game_list**: Armazena as listas de jogos
- **tb_belonging**: Tabela de associação entre jogos e listas, incluindo posicionamento


## 🚀 Como Executar o Projeto

1. Clone o repositório
   ```bash
   git clone https://github.com/joaopcarmo/GMList.git
   ```

2. Entre na pasta do projeto
   ```bash
   cd GMList
   ```

3. Execute o projeto usando Maven
   ```bash
   ./mvnw spring-boot:run
   ```

4. A API estará disponível em `http://localhost:8080`


## 💡 Próximos Passos

- Implementação de operações de criação, atualização e exclusão (CRUD completo)
- Autenticação e autorização de usuários
- Documentação da API com Swagger
- Implementação de testes automatizados
- Frontend para consumo da API


## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE).



## 📞 Contato

**João Pedro Carmo**  
📧 Email: [joaocarmolp@gmail.com](mailto:joaocarmolp@gmail.com)  
🐙 GitHub: [joaopcarmo](https://github.com/joaopcarmo)  
💼 LinkedIn: [joaopcarmo](https://www.linkedin.com/in/joaopcarmo/)
