import axios from "axios"
import https from 'https'

const agent = new https.Agent({  
  rejectUnauthorized: false
});

const config = {
  httpsAgent: agent,
  auth: {
      username: 'linda ',
      password: 'linda'
  }
};

export function doLogin (loginRequest) {
    return axios.post(
        `http://localhost:42069/login`, 
        loginRequest, 
        config
        ).then(resonse => {
      return resonse.data;
    });
}
