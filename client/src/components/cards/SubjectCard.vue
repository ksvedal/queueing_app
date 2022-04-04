<template>
<div class="subjectCard">
  <div v-if="administratorStatus">
      <br>
        <button class="button small"
        @click="toggleActive(subject.subject)"> 
        Toggle active 
        </button>
  </div>
  <div v-if="subject.active === 1" 
    class="subjectCard">
    <button class="button full"
    @click="enterSubject(subject)"> {{ subject.subject }}  </button> 
  </div>
  <div v-else 
  class="subjectCard">
  <button class="button full" disabled> {{ subject.subject }} </button>
  </div>
</div>
</template>

<script>
import router from '@/router/index.js'
import store from '@/store/index.js'
import SubjectService from '@/services/SubjectService.js'

export default {
    name: "SubjectCard",
    data() {
        return {
            administratorStatus: false
        }
    },
    props: {
        subject: {
        }
    },
    methods: {
        enterSubject(subject) {
            store.commit('SET_SELECTED_SUBJECT', subject)
            router.push({
                name: 'SubjectPage'
            })
        },
        toggleActive(subject) {
            SubjectService.setup()
            if (this.subject.active === 1) {
                SubjectService.setSubjectInactive(subject)
            } else {
                SubjectService.setSubjectActive(subject)
            }
        }
    },
    created () {
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS
    }
}
</script>