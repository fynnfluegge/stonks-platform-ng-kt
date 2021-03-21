FROM maven:3.6.3-openjdk-11 AS build
COPY api/src /home/app/src
COPY api/pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

FROM openjdk:14-jdk-alpine AS api
VOLUME /tmp
COPY --from=build /home/app/target/algo-invest-core-0.0.1.jar target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]

FROM node:14 AS ui-build
WORKDIR /usr/src/app
COPY web .
RUN npm install && npm install @angular/cli && npm install @angular-devkit/build-optimizer && npm install express-static-gzip && npm install compression --save && npm install gzipper -g && npm run build --prod --aot --build-optimizer && gzipper compress ./build ./dist

FROM node:14 AS web

WORKDIR /root/

COPY --from=ui-build /usr/src/app/dist dist
COPY --from=ui-build /usr/src/app/build build
COPY web/package*.json ./
RUN npm install
COPY web/server.js ./

EXPOSE 3000

CMD [ "node", "server.js" ]