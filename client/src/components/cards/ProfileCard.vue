<template>
  <div class="profileCard display centeredText">
  <div class="fill">
    <img src="profile.png" alt="Your profile picture">
  </div> <br> <br>
      <b> {{ username }} </b> <br>
            {{ online }} <br>

       {{ administratorStatus}} <br>
      {{ studentStatus }} <br> <br>
  </div>
</template>

<script>
import store from '@/store/index.js'

export default {
    name: "ProfileCard",

    update() {
        this.username = store.getters.GET_USERNAME;
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS;
        this.studentStatus = store.getters.GET_STUDENTSTATUS;
        if (store.getters.GET_USERNAME) {
            this.online = 'Online'
        }
    },
    data () {
        return {
            username: 'Placeholder',
            online: 'Placeholder',
            administratorStatus: 'Placeholder',
            studentStatus: '',
        }
    },
}
</script>

<style>

</style>