const express = require('express');
const compression = require('compression');
const expressStaticGzip = require("express-static-gzip");
const app = express();

app.use(compression());

app.use('/*', express.static(__dirname + '/build/var/www'));

app.get('/*', function(req, res) {
    res.sendFile(path.join(__dirname + '/build/var/www/index.html'));
})

app.listen(3000, () => {console.log('Server listen on port 3000')})