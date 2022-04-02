<template>
  <div v-if="subject.active === 1" 
    class="subjectCard">
    <button class="button full"
    @click="enterSubject(subject)"> {{ subject.subject }}  </button> 
  </div>
  <div v-else 
  class="subjectCard">
  <button class="button full" disabled> {{ subject.subject }} </button>
  </div>
</template>

<script>
import router from '@/router/index.js'
import store from '@/store/index.js'

export default {
    name: "SubjectCard",
    props: {
        subject: {
            type: Object,
            required: true
        }
    },
    methods: {
        enterSubject(subject) {
            store.commit('SET_SELECTED_SUBJECT', subject)
            router.push({
                name: 'SubjectPage'
            })
        }
    }
}
</script>