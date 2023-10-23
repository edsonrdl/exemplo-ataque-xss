
const express = require('express');
const app = express();
const cors = require('cors')

app.use(cors())
app.use(express.json());
app.use(express.urlencoded({ extended: true }))

const port = 3001;

app.post('/', (req, res) => {
    const token = req.headers.authorization;
    console.log(`Token: ${token}`);
    console.log(`Corpo: ${JSON.stringify(req.body)}`);
    console.log('---------');
    // EX: Fazer requisição para comprar algo no nome da pessoa
    return res.status(200).send();
})

app.listen(port, () => {
    console.log(`Api rodando - http://localhost:${port}`)
})


  

function sendData() {
  const url = 'http://localhost:9000/sendData';
  const token = localStorage['token'];

  fetch(url, {
    method: 'POST',
    headers: {
      'Authorization': token
    },
    body: JSON.stringify({})
  })
    .then(response => {
      if (response.status === 200) {
        console.log('Requisição bem-sucedida');
      } else {
        console.error('Erro na requisição:', response.status);
      }
    })
    .catch(error => {
      console.error('Erro na requisição:', error);
    });
}
