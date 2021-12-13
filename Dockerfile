FROM openjdk:11.0.10-jdk-oracle
EXPOSE 8080
ADD target/*.jar apps.jar
ENTRYPOINT ["java", "-jar", "apps.jar"]