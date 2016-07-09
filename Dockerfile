FROM java:openjdk-8-jdk

RUN rm /bin/sh && ln -s /bin/bash /bin/sh

WORKDIR /usr/local/src/game-engine

ADD build.gradle /usr/local/src/game-engine
ADD gradle /usr/local/src/game-engine/gradle
ADD gradlew /usr/local/src/game-engine
ADD src /usr/local/src/game-engine/src

ENTRYPOINT ["./gradlew", "jettyRunWar"]