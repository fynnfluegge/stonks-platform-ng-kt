const express = require('express')
const compression = require('compression')
var expressStaticGzip = require("express-static-gzip");
const app = express()

app.use("/", expressStaticGzip("var/www/"));

app.all('/*', function(req, res, next) {
    res.sendFile('index.html.gz', { root: 'var/www' });
});

app.listen(3000, () => {console.log('Server listen on port 3000')})