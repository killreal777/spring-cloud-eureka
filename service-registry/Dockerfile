FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/service-registry-0.1.jar /app/service-registry.jar
ENTRYPOINT ["java", "-jar", "service-registry.jar"]
EXPOSE 8761