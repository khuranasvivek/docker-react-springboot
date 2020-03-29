FROM openjdk:8
WORKDIR /usr/app
VOLUME /tmp
ADD target/explore-experts-0.0.1-SNAPSHOT.jar explore-experts_v_1.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","explore-experts_v_1.jar"]