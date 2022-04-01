/*import axios from "axios"
import https from 'https'
import qs from 'qs'
import store from '@/store/index.js'

const agent = new https.Agent({  
  rejectUnauthorized: false
});

const config = {
  httpsAgent: agent,
  auth: {
      username: 'admin',
      password: 'password'
  }
};

export function doLogin (loginRequest) {
    return axios.post(
        `http://localhost:42069/login`, 
        loginRequest, 
        config
        ).then(resonse => {
          return resonse.data;
        }). catch( err => {
          console.log(err);
        });
}

export function getToken () {
  const data = qs.stringify({
    username: 'admin',
    password: 'password'
  });

  const configWithoutBasicauth = {
    httpsAgent: agent,
    headers: {
      'content-type': 'application/x-www-form-urlencoded;charset=utf-8'
    }
  };

  return axios.post(
        `http://localhost:42069/token`, 
        data, 
        configWithoutBasicauth
      ).then(resonse => {
        return resonse.data;
      }).catch( err => {
        console.log(err);
      });

}

export async function doLoginWithToken (loginRequest) {
  var thisToken = await getToken()
  store.commit('SET_TOKEN', thisToken) 
  const token = store.getters.GET_TOKEN
  store.commit('SET_USER', loginRequest) 



  // usually you will save this token locally and reuse until it is valid
  // when it is expired, a new token can be retrived
  // standard implementation of oauth/oidc also allows you to refresh token
  

  const configWithToken = {
    httpsAgent: agent,
    headers: {
      'Authorization': `Bearer ${token}`,
      'Content-Type': 'application/json',
    }
  }

  return axios.post(
      `http://localhost:42069/login`, 
      loginRequest, 
      configWithToken
      ).then(resonse => {
        console.log(resonse);
        return resonse.data;
      }).catch (err => {
        console.log(err);
  });
}

*/