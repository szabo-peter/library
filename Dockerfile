FROM openjdk:11

EXPOSE 8080

COPY target/*.jar library.jar

ENTRYPOINT ["java","-jar","library.jar"]
