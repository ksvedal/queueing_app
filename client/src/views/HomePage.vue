<template>
    <div class="homePage">
        <h1> Home </h1> <br>

        <button class="button full" v-if="administratorStatus" @click="subjectCreateForm = !subjectCreateForm"> Add Subject </button> <br> <br>
        <div v-show="subjectCreateForm"> <SubjectCreateForm /> <br> <br> </div>

        <h3> Your Subjects: </h3> <br>

        
        <SubjectCard v-for="subject in subjects" :key="subject.id" :subject="subject" />
    </div>
</template>

<script>
// import components here
import SubjectService from '@/services/SubjectService.js'
import SubjectCard from '@/components/cards/SubjectCard.vue'
import SubjectCreateForm from '@/components/forms/SubjectCreateForm.vue'
import store from '@/store/index.js'

export default {
    name: 'HomePage',
    components: {
        SubjectCard,
        SubjectCreateForm
    }, 
    data() {
        return {
            subjects: null,
            subjectCreateForm: false,
            administratorStatus: false,
            user: null,
        }
    },
    created() {
        this.administratorStatus = store.getters.GET_ADMINISTRATORSTATUS
        this.user = store.getters.GET_USERNAME
        SubjectService.setup();

        if (this.administratorStatus) {
            SubjectService.getAllSubjects().then((response) => {
            this.subjects = response.data;
            }).catch(error => console.log(error))
        } else {
            SubjectService.getSubjectsByUser(this.user).then((response) => {
            this.subjects = response.data;
            }).catch(error => console.log(error))
        }   
    }
}
</script>