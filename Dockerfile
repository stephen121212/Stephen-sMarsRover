FROM openjdk:11
COPY target/dockerApplication.jar dockerApplication.jar
EXPOSE 8085
ENDPOINT ["java","-jar", "dockerApplication.jar"]