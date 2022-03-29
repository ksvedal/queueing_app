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
    return apiClient.get("/user/" + username)
  },
  getUsers() {
    return apiClient.get('/user')
  },
  addUser(user) {
    return apiClient.put('/user/' + user)
  }
}