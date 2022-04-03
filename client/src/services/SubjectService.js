import axios from 'axios'
import store from '@/store/index.js'

let apiClient = null

export default {
  setup() {
    let username = store.getters.GET_USERNAME;
    let password = store.getters.GET_PASSWORD;
    let token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64');
    apiClient = axios.create({
      baseURL: 'http://localhost:42069',
      withCredentials: true,
      headers: {
        Accept: 'application/json',
        'Content-Type': `application/json`,
        'Authorization': `Basic ${token}`,
      } 
    })  
  },
  getSubjects() {
    return apiClient.get('/subject')
  },
  getSubjectsByUser(user) {
      return apiClient.get('/subject/' + user)
  }
}