FROM maven:3.6.3-openjdk-11 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

FROM openjdk:14-jdk-alpine
VOLUME /tmp
COPY --from=build /home/app/target/stonk-api-0.0.1.jar target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]