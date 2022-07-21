FROM adoptopenjdk/openjdk8
ENV MYSQL_HOST host.docker.internal
COPY target/*.jar myapp.jar
CMD ["java","-jar","myapp.jar"]