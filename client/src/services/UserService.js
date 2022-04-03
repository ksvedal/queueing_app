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
  getUser(username) {
    return apiClient.get('/user/' + username)
  },
  getUsers() {
    return apiClient.get('/user')
  },
  getUsersBySubject(subject) {
      return apiClient.get('/user/' + subject)
  },
  addUser(user) {
    return apiClient.put('/user/' + user)
  },
  checkIfStudent() {
      return apiClient.get('/student/status/check')
      .catch(function (error) {
        if (error.response) {
          console.log(error.response.data);
          console.log(error.response.status);
          console.log(error.response.headers);
        }
    })
  },
  checkIfAdministrator() {
      return apiClient.get('/administrator/status/check')
      .catch(function (error) {
        if (error.response) {
          console.log(error.response.data);
          console.log(error.response.status);
          console.log(error.response.headers);
        }
      
  })
  }
}