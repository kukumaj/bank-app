FROM tomcat:8.5.77-jre17-temurin

COPY src/main/java/* /usr/local/tomcat/webapps/ROOT/