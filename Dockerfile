FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built JAR file from the pipeline's target directory
COPY target/javaWebapp-0.1.jar ./javaWebapp.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "javaWebapp.jar"]
