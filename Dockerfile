FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-11-jdk
COPY target/calculator-mini-project-1.0-SNAPSHOT.jar /
CMD ["java", "-jar", "calculator-mini-project-1.0-SNAPSHOT.jar"]