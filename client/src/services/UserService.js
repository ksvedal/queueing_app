import axios from 'axios'

const username = "linda"
const password = "linda"
const token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64')

const apiClient = axios.create({
    baseURL: 'http://localhost:42069',
    withCredentials: false,
    headers: {
      Accept: 'application/json',
      'Content-Type': `application/json`,
      'Authorization': `Basic ${token}`,
    } 
})     

export default {
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
      return apiClient.get('/student/status/check').catch(function (error) {
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