# 베이스 이미지 openjdk11
FROM openjdk:11 AS builder
# gradlew 복사
COPY gradlew .
# gradle 복사
COPY gradle gradle
# build.gradle 복사
COPY build.gradle .
# settings.gradle 복사
COPY settings.gradle .
# src 복사
COPY src src
# gradlew 실행권한 부여
RUN chmod +x ./gradlew
# jar 파일 생성
RUN ./gradlew bootJar

FROM openjdk:11
COPY build/libs/*.jar bepoTest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","bepoTest.jar"]