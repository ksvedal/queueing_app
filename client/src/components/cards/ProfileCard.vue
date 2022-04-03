<template>
  <div class="profileCard display centeredText">
  <div class="fill">
    <img src="profile.png" alt="Girl in a jacket">
  </div> <br> <br>
      <b> {{ username }} </b> <br>
       {{ administratorStatus}} <br>
      {{ studentStatus }} <br> <br>
      {{ online }}
  </div>
</template>

<script>
import store from '@/store/index.js'

export default {
    name: "ProfileCard",

    data () {
        return {
            username: 'Not logged in',
            administratorStatus: '',
            studentStatus: '',
            online: '',
        }
    },
    created() {
        this.username = store.getters.GET_USERNAME;
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS;
        this.studentStatus = store.getters.GET_STUDENTSTATUS;
        if (store.getters.GET_USERNAME) {
            this.online = 'Online'
        }
    },
}
</script>

<style>

</style>