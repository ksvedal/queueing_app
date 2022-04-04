<template>
    <form @submit.prevent="addSubject()" class="display">
      <input 
        class="full" 
        v-model="student.id"
        label="Student id"
        type="int"
        placeholder="Student id"
      />

      <button 
        class="button full black" 
        type="submit">
        Add
      </button>
  </form>
</template>

<script>
import store from '@/store/index.js'


export default {
    name: 'AddStudentToSubjectForm',
    data() {
      return {
          subject: '',
          student: {
              id: '',
          }
      }
    },
    methods: {
        onSubmit() {
            console.log("To be introduced");
        }
    },
    created() {
        this.subject = store.getters.GET_SELECTEDSUBJECT
    }
}
</script>