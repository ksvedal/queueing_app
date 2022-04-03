<template>
  <!--3. Use -->
  <div>
    <h3> Log in here: </h3> <br>
    <LoginForm />
  </div>
</template>

<script>
// 1. Import
import LoginForm from "@/components/forms/LoginForm.vue";

// 2. Bind
export default {
  name: 'LoginPage',
  components: {
    LoginForm,
  }
}
</script>
