const express = require('express')
const compression = require('compression')
const app = express()

app.use(express.static('var/www'));
app.use(compression());

app.all('/*', function(req, res, next) {
    res.sendFile('index.html.gz', { root: 'var/www' });
});

app.listen(3000, () => {console.log('Server listen on port 3000')})