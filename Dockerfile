FROM payara/server-full:5.2021.7
USER payara
COPY postgresql-42.2.24.jar /opt/payara/glassfish/domains/domain1/lib
COPY target/sample.war $DEPLOY_DIR
