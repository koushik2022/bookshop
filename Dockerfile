FROM openjdk:8

EXPOSE 8082
ADD target/bookshop.jar bookshop.jar
ENTRYPOINT ["java","-jar","/bookshop.jar"]

