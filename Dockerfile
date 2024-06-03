# Use the official Tomcat base image
FROM tomcat:9.0.73-jdk11-openjdk

# Set the working directory
WORKDIR /usr/local/tomcat

# Copy the WAR file to the Tomcat webapps directory
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the Tomcat port
EXPOSE 8080

# Set the entry point to run Tomcat
CMD ["catalina.sh", "run"]