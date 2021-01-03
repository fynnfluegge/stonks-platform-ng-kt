const express = require('express')
const app = express()

app.use(express.static('var/www'));

app.all('/*', function(req, res, next) {
    res.sendFile('index.html', { root: 'var/www' });
});

app.listen(3000, () => {console.log('Server listen on port 3000')})