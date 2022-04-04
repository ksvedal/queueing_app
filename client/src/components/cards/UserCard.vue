<template>
  <div class="userCard">
      <div class="display"> 
        <div class="centeredText">
            <b> {{ user.username }} </b>
        </div> 
        <div class="centeredText">
            Room: {{ user.room }} - {{user.table}}
        </div> 
        <div class="centeredText">
            Assignment: {{ user.assignment }} - {{ user.comment }}
        </div> 
        <br>
        <div class="centeredText">
            <button class="button black" v-if="administratorStatus"> Give help </button>  
            <button class="button black" v-if="administratorStatus"> Approve </button>  
            <button class="button black" v-if="administratorStatus"> Extend </button>
        </div>
      </div>
  </div>
</template>

<script>
import store from '@/store/index.js'

export default {
    name: "UserCard",
    data () {
        return {
            administratorStatus: false
        }
    },
    props: {
        user: {
            type: Object,
            required: true
        }
    },
    created() {
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS
    }

}
</script>