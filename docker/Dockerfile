FROM docker.quncrm.com/base/java8
RUN mkdir -p  /etc/service/lbs-service
COPY lbs-service.jar /srv/lbs-service/lbs-service.jar
COPY conf/start.sh /etc/service/lbs-service/run
RUN chmod +x /etc/service/lbs-service/run
VOLUME /var/log
VOLUME /usr/local/tomcat/logs
EXPOSE 7070
