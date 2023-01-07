# UDEMY Spring Cloud Fundamentals
## Price Service

### Project requirements

Java 17. Install Java if you don't already have
it: [Java Downloads](https://www.oracle.com/java/technologies/downloads/)

Maven 3.8.7 or late

### Build Project

  ```
  mvn install
  ```

### Launch App locally

Required ports: 8090

1. Start [Ticket Service](https://github.com/art-sov/TicketService) spring-boot application on port 8080
2. Start Price Service:
```
java -jar target/PriceService-0.0.1-SNAPSHOT.jar
```
