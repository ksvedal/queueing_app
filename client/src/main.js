import { createApp } from 'vue'
import App from './App.vue'
import store from './store'
import vuex from 'vuex'
import router from './router'


createApp(App).use(router).use(store).use(vuex).mount('#app')
