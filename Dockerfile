FROM openjdk:8

WORKDIR /usr/app
# Set the working directory

VOLUME /tmp

COPY *.jar ./
#ADD explore-experts-0.0.1-SNAPSHOT.jar app.jar   
# Copy the jar from local target directory to workdir in the image with given jar name


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]