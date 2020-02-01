
FROM postgres:12

ENV POSTGRES_USER world
ENV POSTGRES_PASSWORD world123
ENV POSTGRES_DB world-db

# Copier les scripts SQL dans :
ADD scripts/*.sql /docker-entrypoint-initdb.d/

# Copier les scripts d'init dans :
#ADD scripts/*.sh /docker-entrypoint-initdb.d/

COPY docker-healthcheck /usr/local/bin/
RUN chmod +x /usr/local/bin/docker-healthcheck

HEALTHCHECK CMD ["docker-healthcheck"]

FROM openjdk:8u191-jdk-alpine3.9
ADD build/libs/TProject-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar TProject-0.0.1-SNAPSHOT.jar

