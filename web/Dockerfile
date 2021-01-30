FROM node:14 AS ui-build
WORKDIR /usr/src/app
COPY . .
RUN npm install && npm install @angular/cli && npm install @angular-devkit/build-optimizer && npm install compression --save && 
npm install gzipper && npm run build --prod --aot --build-optimizer

FROM node:14 AS server-build

WORKDIR /root/

COPY --from=ui-build /usr/src/app/build ./
COPY package*.json ./
RUN npm install
COPY server.js ./

EXPOSE 3000

CMD [ "node", "server.js" ]