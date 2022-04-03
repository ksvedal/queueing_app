import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '@/views/HomePage.vue'
import SubjectPage from '@/views/SubjectPage.vue'
import LoginPage from '@/views/LoginPage.vue'
import store from '@/store/index.js'

const routes = [
    {
        path: '/',
        name: 'HomePage',
        component: HomePage
    },
    {
        path: '/subject',
        name: 'SubjectPage',
        component: SubjectPage
    },
    {
        path: '/login',
        name: 'LoginPage',
        component: LoginPage
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL), 
    routes,
})
  


router.beforeEach((to, from, next) => {
    let isLoggedIn = store.getters.GET_LOGIN
    if (to.name !== 'LoginPage' && !isLoggedIn) next({ name: 'LoginPage' })
    else next()
  })
  

export default router