# Product Service

This project is part of a larger architecture where multiple microservices are interconnected and deployed on Kubernetes and Lambda services. It aims to compare the performance of both platforms.

![Big Picture](https://i.ibb.co/pZHv0C0/Minor-Project.png)

This project is developed as an academic requirement for the Minor Project.

## How to Run

Follow these steps to run the project:

1. Clone the project repository.

2. Ensure that you have Java 17 or a later version installed on your machine.

3. Bring up the Docker containers by running the following command in your terminal:

```bash
   docker-compose up -d
```

4. Build the project by running the following command:

```bash
mvn clean install
```
5. Run the project by executing the following command to start the JAR file:

```bash
java -jar target/product-service-0.0.1-SNAPSHOT.jar
```

### voilà :) the project is up and running on port 8080

## API Documentation 

Access the API documentation at: http://localhost:8080/swagger-ui/index.html

## How to run the project on Docker
TBD

## How to run the project on Kubernetes
TBD
