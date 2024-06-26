FROM gradle:8.7-jdk17-alpine
WORKDIR /app
COPY ./ ./

RUN gradle bootJar
EXPOSE 8080
CMD ["java","-Dspring.profiles.active=dev","-jar","build/libs/product-0.0.1-SNAPSHOT.jar"]