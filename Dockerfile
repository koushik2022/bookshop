FROM openjdk:8

EXPOSE 8080
ADD target/bookshop.jar bookshop.jar
ENTRYPOINT ["java","-jar","/bookshop.jar"]

