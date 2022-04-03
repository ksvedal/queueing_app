import { createStore } from 'vuex'

export default createStore({
    state: {
        selected_subject: null,
    },
    currentUser: {
        username: '',
        password: '',
        administrator: false,
        student: false,
    },

    mutations: {
        SET_TOKEN(state, token) {
            state.token = token
        },
        SET_USERNAME(currentUser, data) {
            currentUser.username = data
        },
        SET_PASSWORD(currentUser, data) {
            currentUser.password = data
        },
        SET_ADMINISTRATOR(currentUser, data) {
            currentUser.administrator = data
        },
        SET_STUDENT(currentUser, data) {
            currentUser.student = data
        },
        SET_SELECTED_SUBJECT(state, subject) {
            state.selected_subject = subject
        }
    },

    actions: {

    },

    getters: {
        GET_TOKEN(state) {
            return state.token
        },
        GET_USERNAME(currentUser) {
            return currentUser.username
        },
        GET_ADMINISTRATORSTATUS(currentUser) {
            return currentUser.administrator
        },
        GET_STUDENTSTATUS(currentUser) {
            return currentUser.student
        },
        GET_SELECTED_SUBJECT(state) {
            return state.selected_subject
        },
    },

    modules: {

    }
})