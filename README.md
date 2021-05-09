# Order Manager

### 🚀 About

The idea of this project is to manage orders of any kind, this project is under construction.

### 📌 Features
* Save a new order
* List that orders
* Get Orders by client id

### TODO
* Alter orders
* Order status
* Dockerfile database
* Implement logger
* Consume orders from redis
* Publish update
* Calculate order total value by itens value

### 🔨 Tecnologies
* [Kotlin Lang](https://kotlinlang.org/)
* [H2DB](https://www.h2database.com/html/main.html)
* [Spock Framework](https://spockframework.org/)
* [Swagger](https://swagger.io/)

### 💻 How to use

Run with IDE or:

```sh
$ mvn install
$ mvn clean package
$ docker build -t caiquecsx/order-manager .
$ docker run -p 8080:8080 caiquecsx/order-manager
```

---
Developed by [Caique Campos](https://www.linkedin.com/in/caiquecsx/) 🚀


