<template>
    <form @submit.prevent="addSubject()" class="display">
      <input
        class ="full" 
        v-model="subject.subject"
        label="Subject"
        type="text"
        placeholder="Subject"
      />

      <input 
        class="full" 
        v-model="subject.assignments"
        label="Assignments"
        type="int"
        placeholder="N of total assignments"
      />

      <button 
        class="button full black" 
        type="submit">
        Add
      </button>
  </form>
</template>

<script>
import SubjectService from '@/services/SubjectService.js'
export default {
    name: 'SubjectCreateForm',
    data() {
      return {
          subject: {
            subject: '',
            assignments: '',
            active: 0,
        }
      }
    },
    methods: {
        addSubject() {
            SubjectService.addSubject(this.subject)
        }
    }
}
</script>
