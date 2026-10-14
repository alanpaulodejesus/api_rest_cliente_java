<div align="center">

# 🚀 api_rest_cliente_java

**API REST para gerenciamento de clientes, construída com Java e Spring Boot**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![H2](https://img.shields.io/badge/H2_Database-1021FF?style=for-the-badge&logo=databricks&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

</div>

---

## 📖 Sobre o projeto

Esta é uma **API REST** desenvolvida com **Java** e **Spring Boot**, que implementa as operações básicas de um CRUD:

| Método | Descrição |
|:------:|-----------|
| `POST` | Cria um novo registro |
| `GET` | Consulta registros |
| `PUT` | Atualiza um registro existente |
| `DELETE` | Remove um registro |

---

## 🛠️ Tecnologias

- ☕ **Java** (JDK)
- 🍃 **Spring Boot**
- 📦 **Maven**
- 🗄️ **H2 Database** (banco em memória)
- 📚 **Swagger / OpenAPI** (documentação)

---

## ✅ Pré-requisitos

Antes de começar, você precisa ter instalado em sua máquina:

- [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)

---

## ▶️ Como executar

**1️⃣ Clone o projeto**

```bash
git clone <url-do-repositorio>
```

**2️⃣ Abra o projeto na sua IDE**

**3️⃣ Aguarde o build**

Após o build, o Maven baixa automaticamente todas as dependências necessárias.

**4️⃣ Inicie a aplicação**

Execute a classe `ProjectApiApplication` (botão **Run**).

---

## 🔗 Acessos

Com a aplicação em execução, utilize os links abaixo:

| Recurso | URL |
|---------|-----|
| 📚 **Documentação (Swagger UI)** | [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html) |
| 🗄️ **Console do banco H2** | [http://localhost:8081/h2-console/login.jsp](http://localhost:8081/h2-console/login.jsp) |

---

## 📝 Observações

> 💡 Este projeto utiliza o banco de dados **H2 em memória**, portanto os dados são **perdidos** sempre que a aplicação é reiniciada.

- Os endpoints podem ser testados diretamente pelo **Swagger UI**.
- Para acessar o console do H2, utilize a *JDBC URL*, o usuário e a senha definidos no arquivo `application.properties`.

---

<div align="center">

Feito com ☕ e Spring Boot

</div>
