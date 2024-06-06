tomcat:10.1-jdk17-openjdk

# Set the working directory
WORKDIR /usr/local/tomcat

# Copy the WAR file to the Tomcat webapps directory
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the Tomcat port
EXPOSE 8080

# Set the entry point to run Tomcat
CMD ["catalina.sh", "run"]
