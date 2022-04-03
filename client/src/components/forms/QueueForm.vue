<template>
    <form @submit.prevent="onSubmit()" class="display">
      <input
        class ="full" 
        v-model="queue.room"
        label="Room"
        type="text"
        placeholder="Room"
      />

      <input 
        class="full" 
        v-model="queue.table"
        label="Table"
        type="text"
        placeholder="Table"
      />

      <input
        class ="full" 
        v-model="queue.assignment"
        label="Assignment"
        type="text"
        placeholder="Assignment"
      />

      <input
        class ="full" 
        v-model="queue.comment"
        label="Comment"
        type="text"
        placeholder="Comment"
      />

      <button 
        class="button full black" 
        type="submit">
        Enter
      </button>
  </form>
</template>

<script>
import QueueService from '@/services/QueueService.js'
import store from '@/store/index.js'
//import { useField, useForm } from 'vee-validate'
//import { object, string } from 'yup'

export default {
    data () {
        return {
            subject: null,
            queue: {
                id: '',
                username: '',
                assignment: '',
                room: '',
                table: '',
                comment: '',
                subject_id: ''
            }
        }
    },
    methods: {
        onSubmit() {
            QueueService.addUserToQueue(this.queue);
        }
    },
    created() {
        this.subject = store.getters.GET_SELECTED_SUBJECT
    }
}
</script>