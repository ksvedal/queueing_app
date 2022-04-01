import { createStore } from 'vuex'

export default createStore({
    state: {
        token: null,
        user: null,
        selected_subject: null,
    },

    mutations: {
        SET_TOKEN(state, token) {
            state.token = token
        },
        SET_USER(state, data) {
            state.user = data
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
        GET_USER(state) {
            return state.user
        },
        GET_SELECTED_SUBJECT(state) {
            return state.selected_subject
        }
    },

    modules: {

    }
})