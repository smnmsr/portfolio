FROM gradle:8.4.0-jdk21 AS build
WORKDIR /app

  # Copy project files
COPY . .

  # Build the application
RUN ./gradlew build --no-daemon

  # Stage 2: Create the runtime image
FROM eclipse-temurin:21-jre AS runtime
WORKDIR /app

  # Copy the built jar from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

  # Expose the application port
EXPOSE 8080

  # Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]