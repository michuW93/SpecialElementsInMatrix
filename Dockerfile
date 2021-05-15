FROM openjdk:15
MAINTAINER michal.walkowiak93@gmail.com
COPY ./out/production/SpecialElementsInMatrix/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","Main"]