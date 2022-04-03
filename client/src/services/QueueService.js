import axios from 'axios'

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
    getQueueBySubject(subject) {
        return apiClient.get('/queue/' + subject)
    },
    addUserToQueue(queue) {
        return apiClient.post('/queue/' + queue)
    }
}