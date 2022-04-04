<template>
    <div class="subjectPage">
        <h1> Queue for {{ this.subject.subject }} </h1> <br>
        <Queue />

        <button class="button full" v-if="studentStatus" @click="queueForm = !queueForm"> Queue up </button> <br> <br>
        <div v-show="queueForm"> <QueueForm /> <br> <br> </div>

        <button class="button full" v-if="administratorStatus" @click="addStudentToSubjectForm = !addStudentToSubjectForm"> Add student to subject </button> <br> <br>
        <div v-show="addStudentToSubjectForm"> <AddStudentToSubjectForm /> <br> <br> </div>
    </div>
</template>

<script>
// import subjects here
import Queue from '@/components/Queue.vue'
import QueueForm from '@/components/forms/QueueForm.vue'
import AddStudentToSubjectForm from '@/components/forms/AddStudentToSubjectForm.vue'
import store from '@/store/index.js'

export default {
    name: 'SubjectPage',
    data() {
        return {
            subject: null,
            queueForm: false,
            studentStatus: false,
            addStudentToSubjectForm: false,
            administratorStatus: false,
        }
    },
    components: {
        Queue,
        QueueForm,
        AddStudentToSubjectForm
    },
    methods: {
    },
    created() {
        this.subject = store.getters.GET_SELECTED_SUBJECT
        this.studentStatus = store.getters.GET_STUDENTSTATUS
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS
    }
}
</script>