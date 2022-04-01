<template>
  <div class="userCard">
      <div class="display"> 
        <div class="centeredText">
            {{ user.username }} 
        </div>
        <div class="centeredText">
            <button class="button"> Give help </button> -
            <button class="button"> Approve </button> -
            <button class="button"> Extend </button>
        </div>
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