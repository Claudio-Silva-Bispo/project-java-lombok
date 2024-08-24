# javamysql-backend

This is a sample project of a Dockerized MySQL accessed by a simple backend with a CRUD functionality using Java SpringBoot technology.

## Pre-Requisites

- OSX 11.7.1 (Big Sur)
- Docker Desktop v4.1.0
- Maven v3.8.7
- Java (JDK 17), with SpringBoot 3.0.1

## Steps to Initialize

MYSQL

	$ docker network create --driver bridge javamysql-network

	$ docker container run -p 3306:3306 --name docker-mysql --network javamysql-network -e MYSQL_ROOT_PASSWORD=1q2w3e4r5t -e MYSQL_DATABASE=javamysqldb -d mysql:latest

	$ docker container exec -it docker-mysql bash

	$ mysql -u root -p javamysqldb

	$ CREATE TABLE users ( id int NOT NULL, first_name varchar(255) NOT NULL, last_name varchar(255), email varchar(255), gender varchar(255) );

	$ INSERT INTO users (id, first_name, last_name, gender, email) VALUES (1, 'Teste', 'Teste', 'male', 'teste@gmail.com');

	$ SELECT * FROM users;

## Inserir a dependência do Swagger no projeto

     <dependency>
          <groupId>org.springdoc</groupId>
          <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
          <version>2.6.0</version>
       </dependency>

## Rodar a aplicação no navegador para visualizar a documentação: isso depois a etapa JAVA BACKEND, logo abaixo..

    http://localhost:8080/swagger-ui/index.html

### Ajustar no terminal do IntelliJ

## Configurar Java para a versão 17, hoje tenho várias versões instaladas e pode dar conflito

    $ export JAVA_HOME=$(/usr/libexec/java_home -v 17)

## Verificar versão do Java e saber se está correta
    
    $ java -version

JAVA BACKEND

## Limpar e Buildar Projeto:
	
    $ mvn clean package

	$ mvn -Dmaven.test.skip=true package
    
## Para rodar no terminal
    
    $ mvn spring-boot:run

	$ docker build -t javamysql-backend:latest .

	$ docker run -p 8080:8080 --name java-backend javamysql-backend:latest

