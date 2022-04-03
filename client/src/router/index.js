import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '@/views/HomePage.vue'
import SubjectPage from '@/views/SubjectPage.vue'
import LoginPage from '@/views/LoginPage.vue'

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
    routes
})
  

export default router