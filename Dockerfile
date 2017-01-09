FROM cuddle/fluentd:1.0.0

ENV logname=REPLACE_CONTENT_NAME

COPY target/instruction-service-1.0-SNAPSHOT.jar /app/

EXPOSE 8080

VOLUME /cuddle/config

WORKDIR /app

COPY docker-entrypoint.sh /

ENTRYPOINT ["/docker-entrypoint.sh"]
