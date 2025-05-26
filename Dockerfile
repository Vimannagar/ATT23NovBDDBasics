FROM maven:3.9.9-eclipse-temurin-11-alpine
RUN apk add jq
RUN apk add curl
COPY src /home/seleniumbddcucumbertestframework/src
COPY pom.xml /home/seleniumbddcucumbertestframework
COPY testng.xml /home/seleniumbddcucumbertestframework
COPY runner.sh runner.sh
RUN dos2unix runner.sh
RUN mvn -f /home/seleniumbddcucumbertestframework/pom.xml clean test -DskipTests=true
ENTRYPOINT sh runner.sh