FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/url-shortner.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","url-shortner.jar"]