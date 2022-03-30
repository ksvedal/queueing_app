<template>
  <div class="subjectCard">
    <button class="button full" @click="enterSubject(subject)"> {{ subject.subject }}  </button> 
  </div>
</template>

<script>
import router from '@/router/index.js'

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
                        this.$store.dispatch('setSelectedSubject', subject)
,
            router.push({
                name: 'SubjectPage'
            })
        }
    }
}
</script>