<template>
    <div class="homePage">
        <h1> [ home ] </h1> <br>
        Show home here
        <Queue />
    </div>
</template>

<script>
// import components here
import Queue from '@/components/Queue.vue'

export default {
    name: 'HomePage',
    components: {
        Queue
    }
}
</script>