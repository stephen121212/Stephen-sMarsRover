FROM java:8
ADD target/demo-*.jar /demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]
EXPOSE 8080/tcp