FROM openjdk:11
EXPOSE 8080
ADD target/maven-cicd-gitaction.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]
