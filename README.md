# 🎯 Spring Boot ELK

## 📦 Project Architecture

![Spring Boot ELK](https://github.com/Muhammederendemir/spring-boot-elk/blob/master/docs/image/springboot-logstash.png)


## 📌 Case

I have a User Structure and I will create transaction in H2 database system. I will save and view the transactions I have done as logs.

## 🖖🏼 Features

- CRUD operation.
- Open api swagger
- Logging with aspect oriented programming.
- Logging with Logstash.
- Log indexing with Elasticsearch.
- Log monitoring with Kibana.
- Docerize the project.


## 🤙🏼 Used Technologies

**Programing Language:**
- Java 11
- Spring Boot 2.7.7

**Dependencies:**
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- springfox-boot-starter
- lombok
- h2
- logstash-logback-encoder

**3.Party Tools:**
- Elasticsearch:
  - docker.elastic.co/elasticsearch/elasticsearch:7.10.0
- Logstash;
  - docker.elastic.co/logstash/logstash:7.10.0
- Kibana;
  - docker.elastic.co/kibana/kibana:7.10.0
## 👌🏼 Deployment

Run this project to deploy.

```bash
  docker-compose up -d
```


## 🤟🏼 Run it on your computer

Run 3rd Party products with Docker

Clone the ELK Docker Deployment project

```bash
  git clone https://github.com/Muhammederendemir/elk-docker-deployment.git
```

Go to the project directory

```bash
  cd elk-docker-deployment
```

```bash
  docker-compose up -d 
```
Then we can get our project up and running.

Clone the project

```bash
  git clone https://github.com/Muhammederendemir/spring-boot-elk.git
```

Go to the project directory

```bash
  cd spring-boot-elk
```

You can run the java project through IDEA. You can make improvements and examine it with Debug.



##  🫳🏼 Associated Projects

Here are some related projects


  