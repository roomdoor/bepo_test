# 베이스 이미지 openjdk11
FROM openjdk:11 AS builder
## gradlew 복사
#COPY gradlew .
## gradle 복사
#COPY gradle gradle
## build.gradle 복사
#COPY build.gradle .
## settings.gradle 복사
#COPY settings.gradle .
## src 복사
#COPY src src
## gradlew 실행권한 부여
#RUN chmod +x ./gradlew
## jar 파일 생성
#RUN ./gradlew bootJar
#
#FROM openjdk:11
## builder 이미지에서 생성된 jar 파일 app.jar로 복사
COPY build/libs/*.jar bepo.jar
# 8080 컨테이너 포트 노출
EXPOSE 8080
# jar 파일 실행
ENTRYPOINT ["java","-jar","/bepo.jar"]