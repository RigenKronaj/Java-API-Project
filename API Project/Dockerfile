FROM openjdk
RUN mkdir /usr/app
COPY ./target/API-0.0.1-SNAPSHOT.jar /usr/app
COPY ./data.csv /usr/app
WORKDIR /usr/app
CMD ["java", "-jar", "API-0.0.1-SNAPSHOT.jar"]