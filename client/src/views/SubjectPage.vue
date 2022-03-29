<template>
    <div class="subjectPage">
        <h1> [ queue for subject] </h1> <br>
        
        <Queue />
    </div>
</template>

<script>
// import subjects here
import Queue from '@/components/Queue.vue'

export default {
    name: 'SubjectPage',
    components: {
        Queue
    }
}
</script>