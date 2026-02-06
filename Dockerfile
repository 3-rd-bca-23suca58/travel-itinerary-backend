# Use Eclipse Temurin OpenJDK 17 (works on Docker Hub)
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy jar
COPY target/travel_itinerary_backend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
