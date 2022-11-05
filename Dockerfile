FROM openjdk:11-jre-slim
COPY build/libs/*.jar bepoTest.jar
ENTRYPOINT ["java","-DString.profiles.active=pord","-Dmailgun.key=${MAILGUN_KEY}","-jar","bepoTest.jar"]