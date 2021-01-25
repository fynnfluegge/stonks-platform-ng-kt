FROM node:10-alpine AS ui-build
WORKDIR /usr/src/app
COPY . .
RUN npm install && npm install @angular/cli && npm install @angular-devkit/build-optimizer && npm run build --prod --aot --buil-optimizer

FROM node:10-alpine AS server-build

WORKDIR /root/

COPY --from=ui-build /usr/src/app/build ./
COPY package*.json ./
RUN npm install
COPY server.js ./

EXPOSE 3000

CMD [ "node", "server.js" ]


