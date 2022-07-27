FROM openjdk:11
ENV APP_HOME=/app
RUN mkdir /app
COPY target/*.jar ems.jar
CMD ["java", "-jar","/ems.jar"]
