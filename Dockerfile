FROM openjdk:8-jre
ADD target/OneToOneJPA-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app.jar"]