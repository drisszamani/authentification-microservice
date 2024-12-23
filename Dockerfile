# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application (JAR file) into the container
COPY target/auth-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the application's port
EXPOSE 8083

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
