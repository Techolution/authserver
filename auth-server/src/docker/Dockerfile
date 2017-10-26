FROM davidcaste/alpine-java-unlimited-jce:jdk8
COPY target/* /target/
CMD ["java","-Dspring.profiles.active=container", "-jar", "/target/auth-server-0.0.1.jar"]