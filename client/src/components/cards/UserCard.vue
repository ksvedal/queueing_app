<template>
  <div class="userCard">
      <div class="display"> 
        <div class="centeredText">
            {{ user.username }} 
        </div>
        <div class="centeredText">
            <button class="button black"> Give help </button> -
            <button class="button black"> Approve </button> -
            <button class="button black"> Extend </button>
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