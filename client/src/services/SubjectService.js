import axios from 'axios'
/* import store from '@/store/index.js'
import http from 'http'

/*
//const username = "linda"
//const password = "linda"
//const token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64')
//const token = store.state.token
const token = store.getters.GET_TOKEN
const user = store.getters.GET_USER

const agent = new http.Agent({  
    rejectUnauthorized: false
});

const auth = {
    user,
    httpAgent: agent,
    headers: {
      'Authorization': `Bearer ${token}`,
      'Content-Type': 'application/json',
    }
}



const apiClient = axios.create({
    baseURL: 'http://localhost:42069',
    withCredentials: true,
    auth
  })     */
  const username = "linda"
  const password = "linda"
  const token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64')
  
  const apiClient = axios.create({
      baseURL: 'http://localhost:42069',
      withCredentials: true,
      headers: {
        Accept: 'application/json',
        'Content-Type': `application/json`,
        'Authorization': `Basic ${token}`,
      } 
    }) 

export default {
  getSubjects() {
    return apiClient.get('/subject')
  },
  getSubjectsByUser(user) {
      return apiClient.get('/subject/' + user)
  }
}