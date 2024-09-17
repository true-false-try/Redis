FROM openjdk:17
EXPOSE 8099
WORKDIR .
COPY "/target/Redis-0.0.1-SNAPSHOT.jar" redis-app.jar
COPY .env ./.env
CMD [ "java", "-jar", "redis-app.jar" ]