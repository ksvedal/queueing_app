  <template>
    <div id="loginContainer">
      <input
        class ="full" 
        v-model="username"
        label="username"
        type="text"
        placeholder="username"
      />

      <input
        class ="full" 
        v-model="password"
        label="password"
        type="text"
        placeholder="password"
      />

      <button 
        class="button full" 
        type="submit"
        v-on:click="handleClickSignin">
        Log in
      </button>
      <br> <br>
      <div class="centeredText full">
       <!-- <label id="loginstatusLabel">{{loginStatus}}</label> <br> <br>
        <label id="token">{{token}}</label> <br> <br>
        <label id="user">{{user}}</label> <br> <br> -->

      </div>
    </div>
</template>


<script>
/*import { doLoginWithToken } from '@/utils/apiutil.js'
import store from '@/store/index.js'

export default {
  name: 'LoginComponent',
  methods: {
    handleClickSignin () {
      const loginRequest = { username: this.username, password: this.password };
      const loginResponse = doLoginWithToken(loginRequest);
      console.log(loginResponse)
      loginResponse.then((resolvedResult) => {
        this.loginStatus = resolvedResult.loginStatus;
        this.token = store.getters.GET_TOKEN
        this.user = store.getters.GET_USER
      })
    }
  },
  data() {
    return {
      username: '',
      password: '',
      loginStatus: '',
      token: '',
      user: ''
    }
  }

}*/
</script>

