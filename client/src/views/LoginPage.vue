<template>
  <!--3. Use -->
  <div>
    <h3> Log in here: </h3> <br>
    <LoginComponent />
  </div>
</template>

<script>
// 1. Import
import LoginComponent from "@/components/LoginComponent.vue";

// 2. Bind
export default {
  name: 'LoginPage',
  components: {
    LoginComponent,
  }
}
</script>
