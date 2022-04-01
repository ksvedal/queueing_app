<template>
  <div class="subjectCard">
    <button class="button full" @click="enterSubject(subject)"> {{ subject.subject }}  </button> 
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