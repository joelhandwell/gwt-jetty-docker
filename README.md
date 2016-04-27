# gwt-jetty-docker
http://www.gwtproject.org/ app example built by gradle running in jetty docker container

Steps to launch this in your local computer: 
 1. In Windows, Mac or Linux install git, Java8, docker add them to your PATH
 2. In Windows or Mac install docker-machine
 3. In Windows or Mac run ```docker-machine create --driver virtualbox default```
 4. In Windows or Mac run ```docker-machine env```
 5. Pull this repo and change java code and tests
 6. Run following to launch the docker container:

```
gradlew build
docker-machine start default
docker build -t hello .
docker run -d -p 80:8080 hello 
```

Get docker host ip 
```
docker-machine ip
192.168.99.100
```

Open ```http://192.168.99.100/HelloWorld/HelloWorld.html``` in your browser.
