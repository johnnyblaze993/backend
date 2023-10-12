# # Use the official OpenJDK base image
# FROM eclipse-temurin:17


# # Set the working directory in the container
# WORKDIR /app

# # Copy the built JAR into the container
# COPY ./build/libs/backend-0.1-all.jar /app/backend.jar

# # Expose the default Micronaut port
# EXPOSE 8080

# # Command to run the application
# CMD ["java", "-jar", "/app/backend.jar"]

FROM eclipse-temurin:17

# Get wait-for-it script
ADD https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh

WORKDIR /app
COPY ./build/libs/backend-0.1-all.jar /app/backend.jar
EXPOSE 8080
CMD ["/wait-for-it.sh", "db:5432", "--", "java", "-jar", "/app/backend.jar"]
