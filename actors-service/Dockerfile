FROM eclipse-temurin:20-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/actors-service-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="mortimer"
ENTRYPOINT ["java", "-jar", "/app.jar"]jhgkh