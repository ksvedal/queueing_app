<template>
    <div class="subjectPage">
        <h1> Queue for {{ this.subject.subject }} </h1> <br>
        <Queue />
        <button class="button full" v-if="studentStatus" @click="queueForm = !queueForm"> Queue up </button> <br> <br>
        <div v-show="queueForm"> <QueueForm /> <br> <br> </div>
    </div>
</template>

<script>
// import subjects here
import Queue from '@/components/Queue.vue'
import QueueForm from '@/components/forms/QueueForm.vue'
import store from '@/store/index.js'

export default {
    name: 'SubjectPage',
    data() {
        return {
            subject: null,
            queueForm: false,
            studentStatus: false
        }
    },
    components: {
        Queue,
        QueueForm
    },
    methods: {
    },
    created() {
        this.subject = store.getters.GET_SELECTED_SUBJECT
        this.studentStatus = store.getters.GET_STUDENTSTATUS
    }
}
</script>