import axios from "axios";

var bodyFormData = new FormData();


const apiClient = axios.create({
    baseURL: "http://localhost:42069",
    data: bodyFormData,
    headers: {
         "Content-Type": "multipart/form-data" 
    },
})

export default {
    login(username, password) {
        bodyFormData.append('username', username);
        bodyFormData.append('password', password);
        return apiClient.post("/login").then(function (response) {
            console.log(response);
        })
        .catch(function (error) {
            console.log(error);
        });
    }
}