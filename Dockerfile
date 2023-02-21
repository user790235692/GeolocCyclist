FROM maven:3.8.2-adoptopenjdk-8 AS build
COPY src /usr/app/src
COPY pom.xml /usr/app
RUN mvn -f /usr/app/pom.xml clean install -DskipTests

FROM payara/server-full:5.2021.7
USER payara
COPY --from=build /usr/app/target/sample.war $DEPLOY_DIR
