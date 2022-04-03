<template>
    <div class="students">
        <UserCard v-for="user in users" :key="user.id" :user="user"/>
    </div>
</template>

<script>
import QueueService from '@/services/QueueService.js'
import UserCard from '@/components/cards/UserCard.vue'
import store from '@/store/index.js'

export default {
    components: {
        UserCard
    },
    data() {
        return {
            users: null,
            subject: null
        }
    },
    created() {
        QueueService.setup();
        this.subject = store.getters.GET_SELECTED_SUBJECT;
        QueueService.getQueueBySubject(this.subject.subject).then((response) => {
            this.users = response.data;
        }).catch(error => console.log(error))
    }
}
</script>