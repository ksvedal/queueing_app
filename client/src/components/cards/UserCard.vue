<template>
  <div class="userCard">
      <div class="display"> 
        <div class="centeredText">
            <b> {{ user.username }} </b>
        </div> 
        <div class="centeredText">
            Room: {{ user.room }} - {{user.table}}
        </div> 
        <div class="centeredText">
            Assignment: {{ user.assignment }} - {{ user.comment }}
        </div> 
        <br>
        <div class="centeredText">
            <button class="button black"> Give help </button>  
            <button class="button black"> Approve </button>  
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