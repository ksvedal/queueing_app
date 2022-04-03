import axios from 'axios'


let username = "bob"
let password = "bob"
let token = Buffer.from(`${username}:${password}`, 'utf8').toString('base64')

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
  getSubjects() {
    return apiClient.get('/subject')
  },
  getSubjectsByUser(user) {
      return apiClient.get('/subject/' + user)
  }
}