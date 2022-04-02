<template>
    <div class="students">
        <UserCard v-for="user in users" :key="user.id" :user="user"/>
    </div>
</template>

<script>
import UserService from '@/services/UserService.js'
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
        this.subject = store.getters.GET_SELECTED_SUBJECT;
        UserService.getQueueBySubject(this.subject.subject).then((response) => {
            this.users = response.data;
        }).catch(error => console.log(error))
    }
}
</script>