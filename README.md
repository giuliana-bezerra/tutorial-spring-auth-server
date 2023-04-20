<h1 align="center">
  <img alt="spring-auth-server" title="spring-auth-server" src=".github/logo.png" />
</h1>

<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-roteiro">Roteiro</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-como-executar">Como executar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>


<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Tutorial&color=8257E5&labelColor=000000" alt="Tutorial" />
</p>

<h2 align="center">
  <img alt="architecture" title="architecture" src=".github/architecture.png" />
</h2>

<br>

## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)

## 💻 Projeto

Esse projeto foi elaborado [nesse vídeo](https://youtu.be/hgLKOPHfuis) que demonstra como funciona o Spring Authorization Server e como utilizá-lo para autorizar requisições seguindo o Oauth 2.0 e OpenID Connect.

## 🗒️ Roteiro

- [ ] Arquitetura do sistema
- [ ] spring-auth-server
- [ ] client-server
- [ ] resource-server

## 🚀 Como executar

- Clone o repositório
- Abra em qualquer IDE Java
- Execute o projeto Spring Boot

Agora você pode testar os seguintes fluxos seguindo a implementação do OIDC:

- Acesse `http://localhost:8080/home`
- Autentique com o usuário `user` e senha `password`
- Aceite as opções de consentimento
- Visualize os dados gerados pelo AS (access token, refresh token e id token)
- Acesse `http://localhost:8080/tasks`
- Visualize as tarefas do usuário logado

---
