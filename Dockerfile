FROM eclipse-temurin:8-jre-jammy
EXPOSE 80
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
