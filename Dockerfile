# ---- Build Stage ----
FROM maven:3.9.6-eclipse-temurin-21 AS build
LABEL authors="dun1a"

WORKDIR /app

# Copy all project files
COPY . .

# Build the project, skip tests for faster builds
RUN mvn clean package -DskipTests

# ---- Runtime Stage ----
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy the first jar found under any target folder
COPY --from=build /app/*/target/*.jar app.jar

# Run the jar
CMD ["java", "-jar", "app.jar"]