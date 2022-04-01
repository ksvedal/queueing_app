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
/*
router.beforeEach((to, from, next) => {
    // redirect to login page if not logged in and trying to access a restricted page
    const publicPages = ['/login', '/register'];
    const authRequired = !publicPages.includes(to.path);
    const loggedIn = localStorage.getItem('user');
  
    if (authRequired && !loggedIn) {
      return next('/login');
    }
  
    next();
  })
  */

export default router