FROM java:8-jdk
COPY /target/*.jar application-service.jar
CMD exec java -jar /application-service.jar
