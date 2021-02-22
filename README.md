# Microservices with Spring Boot & Spring Cloud

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/heliohdd/hdsdeliver-sds2/blob/main/LICENSE) 

## About the Project
Este projeto é uma solução baseada na arquitetura de microsserviços.

Os principais Cloud Components são: Spring Cloud Config Server, Eureka Naming and Discovery Server, Zuul API Gateway, Spring API Gateway e Zipkin Distributed Tracing.
A parte de microsserviços é composta por: Property Access Service, Product Stock Service, Product Enquiry Service.

<!--
Esta aplicação consiste em um <strong>Sistema de Controle de Pedidos</strong> "e-commerce". Este sitema permite o controle de uma "Loja Virtual" composta por um catálogo de "Produtos" organizados em "Categorias", que podem ser escolhidos pelo "Cliente", e direcionados para serem entregues em um determinado "Endereço".
Após a conclusão do "Pedido", o sistema se comunica com uma API externa integrada para solução de "Pagamentos" online validando então a compra conforme autorização após a realização da operação de pagamento. O sistema ainda envia um e-mail para o cliente com os dados do pedido avisando sobre a confirmação de pagamento.
-->
<!--
### Layout
Veja abaixo as telas que compõem o aplicativo posicionando o cursor sobre as imagens para conferir sua descrição.
## Layouts do <strong><i>"front-end responsivo (web e mobile)"</i></strong>
![Mobile 1](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile1.png "Tela inicial")
![Mobile 2](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile2.png "Tela de Login")
![Mobile 3](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile3.png "Tela de Categorias")
![Mobile 8](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile8.png "Categoria Informática")
![Mobile 9](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile9.png "Produto TV")
![Mobile 10](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile10.png "Seleção do Produto")
![Mobile 12](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile12.png "Produto Colcha")
![Mobile 13](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile13.png "Finalizar Pedido")
![Mobile 14](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile14.png "Selecionar Endereço")
![Mobile 15](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile15.png "Forma de Pagamento")
![Mobile 16](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile16.png "Conferir Pedido Tela 1")
![Mobile 17](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile17.png "Conferir Pedido Tela 2")
![Mobile 4](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile4.png "XXXXXXXXXXXXXXXXXX")
![Mobile 5](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile5.png "XXXXXXXXXXXXXXXXXX")
![Mobile 6](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile6.png "XXXXXXXXXXXXXXXXXX")
![Mobile 7](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile7.png "XXXXXXXXXXXXXXXXXX")
![Mobile 11](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/mobile11.png "XXXXXXXXXXXXXXXXXX")
-->
# Diagrama de todo o Sistema
![Modelo Conceitual](https://github.com/heliohdd/assets/blob/main/raw/main/hdtec-spring-cloud-microservices/Imagem1.png)
<!--
# Modelo conceitual
Abaixo é apresentado o modelo conceitual utilizado para o desenvolvimento desta aplicação.
![Modelo Conceitual](https://github.com/heliohdd/assets/blob/main/raw/main/spring-ionic/modelo-conceitual-spring-ionic.png)
# Tecnologias utilizadas
Abaixo são listadas as tecnologias utilizadas para o desenvolvimento desta aplicação.
## Back-end
- <b>Java 11 LTS</b> - (versão com suporte prolongado)
- <b>Spring Boot 2.0.0</b> - (versão estável do framework)
- <b>JPA/Hibernate</b> - (mapeamento ORM)
- <b>Maven</b> - (gerenciamento de dependências)
- <b>Postman</b> - (testes durante o desenvolvimento)
## Banco de Dados
- H2 - (para ambiente de testes)
- MySQL - (para ambiente de desenvolvimento e de produção)
## Front-end web
- <b>HTML5/CSS3/JS/TypeScript</b> - (desenvolvimento web responsiva)
- <b>Angular</b> - (gerar aplicação web responsiva)
## Integração com API's
- <b>Amazon S3</b> - (para armazenamento de imagens dos clientes e dos produtos)
- <b>Google SMTP</b> - (para comunicação sobre confirmação do pagamento.)
# Implantação do Projeto
O projeto foi implatado na nuvem através da plataforma PaaS <strong>Heroku</strong> com entrega contínua (Github Actions) para a parte do back-end, dispondo assim de um ambiente que oferece alta disponibilidade e escalabilidade permitindo ao Sistema ótimos níveis de performance e funcionabilidade.
# Como testar o projeto localmente?
Pré-requisito:
- [Java 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)
## Back end
-->
**Clonar o repositório**

```
$ git clone https://github.com/heliohdd/hdtec-spring-cloud-microservices

$ cd hdtec-spring-cloud-microservices
```

**Executar o projeto**

```
$ ./mvnw spring-boot:run
```
<!--
Confira a documentação desta API conforme especificação <b>Open API 3.0</b> neste link: 
 [documentação da API](http://localhost:8080/swagger-ui-custom.html).
-->
# Autor
Hélio Dourado

[![LinkedIn Badge](https://img.shields.io/badge/-LinkedIn-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/heliohdd/)](https://www.linkedin.com/in/heliohdd/)
