<template>
    <div class="homePage">
        <h1> Home </h1> <br>
        <h3> Your Subjects: </h3> <br>
        
        <SubjectCard v-for="subject in subjects" :key="subject.id" :subject="subject" />
    </div>
</template>

<script>
// import components here
import SubjectService from '@/services/SubjectService.js'
import SubjectCard from '@/components/cards/SubjectCard.vue'

export default {
    name: 'HomePage',
    components: {
        SubjectCard
    }, 
    data() {
        return {
            subjects: null
        }
    },
    created() {
        SubjectService.setup();
        SubjectService.getSubjectsByUser("bob").then((response) => {
            this.subjects = response.data;
        }).catch(error => console.log(error))
    }
}
</script>