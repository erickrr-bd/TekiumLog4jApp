FROM openjdk:8u181-jdk-alpine
EXPOSE 8080
RUN mkdir /app
COPY  TekiumLog4jApp-1.0-SNAPSHOT.jar /app/TekiumLog4jApp-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "/app/TekiumLog4jApp-1.0-SNAPSHOT.jar"]
