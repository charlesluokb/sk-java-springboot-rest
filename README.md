## Building RESTful Service with Spring Boot 
A skeleton project shows how to develop a RESTful service (JAX-RS) using Spring Boot.

### Project - Scrum Board Service
The project tries to manage sprinting activities for a scrum team.

+ Able to create new stories, and reach story goes through `Todo`, `inProgress`, and `Done` stages
+ Three roles in the scrum team, `BusinessAnalyst`, `Developer`, and `Tester`. 
A team member has only one role to perform. 


##### Tech Stack
Below is a list of frameworks are used

+ Java 8 and above
+ Maven
+ Junit, and Mockito
+ Lombok
+ Spring Boot, Spring Actuator, and Spring Data JPA

##### To Build and Run

To build an executable jar
`./mvnw clean package`

To run the application
`./mvnw spring-boot:run`

