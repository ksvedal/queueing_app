<template>
    <form @submit.prevent="submit" class="display">
      <input
        class ="full" 
        v-model="username"
        label="Your name"
        type="text"
        placeholder="linda"
      />

      <input 
        class="full" 
        v-model="room"
        label="Room"
        type="email"
        placeholder="Room"
      />

      <input
        class ="full" 
        v-model="table"
        label="Table"
        type="text"
        placeholder="Table"
      />

      <button 
        class="button full black" 
        type="submit">
        Enter queue
      </button>
  </form>
</template>

<script>
export default {

}
</script>