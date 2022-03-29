<template>
  <div class="userCard">
      <div class="display"> 
        {{ user.username }} 
        <button class="button "> Rett </button> 
        <button class="button "> Utsett </button> 
        </div>
  </div>
</template>

<script>
export default {
    name: "UserCard",
    props: {
        user: {
            type: Object,
            required: true
        }
    }
}
</script>