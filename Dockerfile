# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /springdeployment

COPY /target/spring-deployment-latest.jar app.jar

# The application's jar file has been created at this point
# Define the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]