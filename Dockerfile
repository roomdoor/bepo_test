FROM openjdk:11-jre-slim
COPY build/libs/*.jar bepoTest.jar
ENTRYPOINT ["java","-DString.profiles.active=pord","-jar","bepoTest.jar"]