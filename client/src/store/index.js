import { createStore } from 'vuex'

export default createStore({
    state: {
        selected_subject: null,
        currentUser: {
            username: '',
            password: '',
            administrator: false,
            student: false,
            isLoggedIn: false,
        },
    },

    mutations: {
        SET_TOKEN(state, token) {
            state.token = token
        },
        SET_USERNAME(state, data) {
            state.currentUser.username = data
        },
        SET_PASSWORD(state, data) {
            state.currentUser.password = data
        },
        SET_ADMINISTRATOR(state, data) {
            state.currentUser.administrator = data
        },
        SET_STUDENT(state, data) {
            state.currentUser.student = data
        },
        SET_LOGIN(state, data) {
            state.currentUser.isLoggedIn = data
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
        GET_USERNAME(state) {
            return state.currentUser.username
        },
        GET_PASSWORD(state) {
            return state.currentUser.password
        },
        GET_ADMINISTRATORSTATUS(state) {
            return state.currentUser.administrator
        },
        GET_STUDENTSTATUS(state) {
            return state.currentUser.student
        },
        GET_LOGIN(state) {
            return state.currentUser.isLoggedIn
        },
        GET_SELECTED_SUBJECT(state) {
            return state.selected_subject
        },
    },

    modules: {

    }
})