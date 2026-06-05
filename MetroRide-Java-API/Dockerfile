FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY build/libs/MetroRide-Java-API-0.0.1-SNAPSHOT.jar metroride-api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "metroride-api.jar"]