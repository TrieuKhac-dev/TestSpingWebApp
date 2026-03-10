FROM eclipse-temurin:21-jdk

RUN useradd -m springuser

WORKDIR /app

COPY build/libs/*.jar app.jar

RUN chown springuser:springuser app.jar

USER springuser

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]