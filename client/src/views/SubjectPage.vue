<template>
    <div class="subjectPage">
        <button class="button full" @click="queueForm = !queueForm"> Queue up </button> <br> <br>
        <div v-show="queueForm"> <QueueForm /> <br> <br> </div>
        <h1> Queue for {{ this.subject.subject }} </h1> <br>
        <Queue />
    </div>
</template>

<script>
// import subjects here
import Queue from '@/components/Queue.vue'
import QueueForm from '@/components/forms/QueueForm.vue'

export default {
    name: 'SubjectPage',
    data() {
        return {
            subject: null,
            queueForm: false
        }
    },
    components: {
        Queue,
        QueueForm
    },
    methods: {
    },
    created() {
        this.subject = this.$store.dispatch('getSelectedSubject')
    }
}
</script>