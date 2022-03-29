<template>
    <div class="homePage">
        <h1> [ home ] </h1> <br>
        Please choose subject
        
        <SubjectCard v-for="subject in subjects" :key="subject.id" :subject="subject"/>
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
        SubjectService.getSubjects().then((response) => {
            this.subjects = response.data;
        }).catch(error => console.log(error))
    }
}
</script>