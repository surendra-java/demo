
FROM openjdk:8
COPY ./*.demo ./
CMD java -jar spring-boot.jar