FROM openjdk:11.0.16-oraclelinux8

ADD demo-docker-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]