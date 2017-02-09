FROM daocloud.io/daocloud/dao-tomcat:v7.0.55

MAINTAINER bobo <bobo2524@yeah.net>

COPY . /tomcat/webapps

EXPOSE 80

CMD tomcat/bin/startup.sh

