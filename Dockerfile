FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-docker-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]