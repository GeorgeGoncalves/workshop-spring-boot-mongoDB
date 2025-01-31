# Projeto workshop com MongoDB

Projeto realizado por mim, com intensão de me aprofundar no aprendizado em BACKEND, através do curso que fiz na [DevSuperior](devsuperior.com.br).
Este projeto simula um post de um certo usuario com comentarios de outros usuarios, todos cadastrados no banco de dados, nesse projeto foi usado o MongoDB.

### Diagrama UML

<img width=70% bottom=50px src="https://github.com/user-attachments/assets/3dfdd042-a57b-40e1-a177-3035a6441a9d"/>

### Imagem do MongoDB com os Usuarios cadastrados

<img width=100% bottom=50px src="https://github.com/user-attachments/assets/3b548715-ac9c-4514-a96b-af30e8ef6963"/>

### tecnologias utilizadas

- Spring Tools Suite(STS)
  - Spring Boot
  - MongoRepository
  - Maven
- MongoDB
- Postman
  - Json
    
Funcoes Endpoints:

- GET /usuarios - Retorna toda a lista de dados.

- GET /usuários/{id} - Retorna dado desejado.

- GET /usuários/{id}/posts - Retorna os posts que o usuário fez.

- GET /posts/{id} - Retorna o post feito.

- GET /posts/tituloprocura?texto= - Retornar posts contendo um dado String no titulo.

- GET /posts/pesquisacompleta?texto= - Retorna posts contendo um dado String em qualquer lugar (no título, corpo ou comentários) e em um dado intervalo de datas.

- POST /usuarios/{id} - Inserindo um novo dado.

- DELETE /usuarios/{id} - deletando dado.

- PUT /usuários/{id} - Alterando dado.

### Imagem de um teste realizado no Postman

<img width=80% bottom=50px src="https://github.com/user-attachments/assets/9118c355-c61d-4133-8525-d4d1c05b4de9"/>

### Foi utilizado a arquitetura de 3 camadas:
- controller
- service
- repository

### Como reproduzir o projeto

# Pré requesitos
java 17

# clonar o repositorio
https://github.com/GeorgeGoncalves/workshop-spring-boot-mongoDB.git

# entrar na pasta 
com.example.demo

# executar o projeto
executar o arquivo WorkshopMongoDbApplication.java
spring boot: run

### Autor

George Gonçalves Miranda  
[<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" />](https://www.linkedin.com/in/george-gon%C3%A7alves-901971323/?trk=li_LOL_SPIN_global_careers_jobsgtm_conv_acq_july2022_spinv1)
