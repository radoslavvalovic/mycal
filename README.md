# Spring Boot, H2, JPA, Hibernate Rest API Tutorial
https://www.javacodegeeks.com/2018/04/spring-hibernate-tutorial.html
https://stackoverflow.com/questions/45302132/h2-not-creating-updating-table-in-my-spring-boot-app-somethings-wrong-with-my?rq=1
https://mycuteblog.com/h2-database-example-hibernate-spring-boot/

https://shakeelosmani.wordpress.com/2017/02/13/step-by-step-spring-boot-hibernate-crud-web-application-tutorial/
https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
http://www.devglan.com/spring-boot/spring-boot-h2-database-example
https://mycuteblog.com/h2-database-example-hibernate-spring-boot/
https://memorynotfound.com/spring-boot-spring-data-jpa-hibernate-h2-web-console/

mvn spring-boot:run
http://localhost:8080
http://localhost:8080/console

Build Restful CRUD API for a simple application using Spring Boot, H2, JPA and Hibernate.

## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone xyz
```

**3. Change username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your db installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/notes
    
    POST /api/notes
    
    GET /api/notes/{noteId}
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

You can test them using postman or any other rest client.

## Learn more

You can find the tutorial for this application on my blog -

