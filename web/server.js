const express = require('express')
const compression = require('compression')
const expressStaticGzip = require("express-static-gzip")
const app = express()

app.use('/*', expressStaticGzip('var/www/', {
    enableBrotli: true,
    customCompressions: [{
        encodingName: 'deflate',
        fileExtension: 'zz'
    }],
    orderPreference: ['br']
}));

app.all('/*', function(req, res, next) {
    res.sendFile('index.html.gz', { root: 'var/www' });
});

app.listen(3000, () => {console.log('Server listen on port 3000')})