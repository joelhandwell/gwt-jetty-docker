FROM jetty
MAINTAINER Joel Handwell

ADD ./build/libs/*.war /var/lib/jetty/webapps/ROOT.war
