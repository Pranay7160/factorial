FROM openjdk:latest
WORKDIR /app
COPY .   /app
RUN javac factorial.java
CMD ["java", "factorial"]