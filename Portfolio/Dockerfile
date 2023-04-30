FROM amazoncorretto:17

LABEL maintainer="ManuelBravard"
LABEL version="0.0.1"
LABEL description="Este Dockerfile crea una imagen para ejecutar el proyecto Portfolio para YOProgramo y la posteridad."

COPY target/Portfolio-0.0.1-SNAPSHOT.jar Portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Portfolio-0.0.1-SNAPSHOT.jar"]