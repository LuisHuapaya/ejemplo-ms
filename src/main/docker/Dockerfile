FROM openjdk:8-jdk-alpine
ADD *.jar app.jar
VOLUME /tmp /tmp
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]