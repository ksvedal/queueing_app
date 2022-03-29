<template>
    <div class="students">
        <UserCard v-for="user in users" :key="user.id" :calculation="user"/>
    </div>
</template>

<script>
import UserService from '@/services/UserService.js'
import UserCard from '@/components/cards/UserCard.vue'

export default {
    components: {
        UserCard
    }, 
    data() {
        return {
            users: null
        }
    },
    created() {
        UserService.getUsers().then((response) => {
            this.users = response.data;
        }).catch(error => console.log(error))
    }
}
</script>

<style>

</style>