<template>
    <div id="loginContainer">
        <form @submit.prevent="handleClickSignin()" class="display">
      <input
        class ="full" 
        v-model="username"
        label="Username"
        type="username"
        placeholder="Username"
      />

      <input 
        class="full" 
        v-model="password"
        label="Password"
        type="password"
        placeholder="Password"
      />

      <button 
        class="button full black" 
        type="submit">
        Login
      </button>
    </form>
    <div class="centeredText">
        <label id="loginstatusLabel"> <br> {{ studentStatus }} <br> <br> {{ administratorStatus }}</label>
    </div>
  </div>
</template>


<script>
import UserService from '@/services/UserService.js'
import store from '@/store/index.js'

export default {
  name: 'LoginComponent',
  methods: {
    async handleClickSignin (){
      store.commit('SET_USERNAME', this.username)
      store.commit('SET_PASSWORD', this.password)
      UserService.setup(),
      UserService.checkIfStudent()
      .then((response) => {
        if (response) {
            store.commit('SET_STUDENT', true)
            store.commit('SET_LOGIN', true)
            this.studentStatus = response.data;
        } else {
            this.studentStatus = "Not student"
        }
      })
      UserService.checkIfAdministrator()
      .then((response) => {
        if (response) {
            store.commit('SET_ADMINISTRATOR', true)
            store.commit('SET_LOGIN', true)
            this.administratorStatus = response.data;
        } else {
            this.administratorStatus = "Not administrator"
        }
      })
    },
  },
  data() {
      return {
        username: '',
        password: '',
        studentStatus: '',
        administratorStatus: '',
      }
  },
  created() {
    store.commit('SET_LOGIN', false)
  }
}
</script>