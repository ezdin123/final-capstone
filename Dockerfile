FROM openjdk:8-jdk
COPY ./target/yenatLounge-0.0.1-SNAPSHOT.jar ecom-webservice-0.0.1-SNAPSHOT.jar
CMD ["java" ,"-jar","yenatLounge-0.0.1-SNAPSHOT.jar"]
RUN echo "jenkins ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers