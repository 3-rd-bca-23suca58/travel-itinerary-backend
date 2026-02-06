# Use lightweight Linux base
FROM ubuntu:22.04

# Install Java 17
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk maven && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Copy backend jar
COPY target/travel_itinerary_backend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]



