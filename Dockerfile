FROM openjdk:17
COPY target/Assigment-One-K8S-0.0.1-SNAPSHOT.jar k8s-assign-one.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/k8s-assign-one.jar"]