<template>
  <div>
      用戶名:<input type="text" v-model="loginForm.username" placeholder="請輸入用戶名"/>
      <br><br>
      密碼： <input type="password" v-model="loginForm.password" placeholder="請輸入密碼"/>
      <br><br>
      <button v-on:click="login">登錄</button><button v-on:click="sign">註冊</button>
  </div>
</template>

<script>
  export default {
    name: 'Login',
    data () {
      return {
        loginForm: {
          username: '',
          password: ''
        },
        responseResult: []
      }
    },
    methods: {
      login () {
        this.$axios
          .post('/login', {
            username: this.loginForm.username,
            password: this.loginForm.password
          })
          .then(successResponse => {
            if (successResponse.data.code === 200) {
              this.$router.replace({path: '/index'})
            }
          })
          .catch(failResponse => {
          })
      },
      sign () {
        this.$router.replace({path: '/sign'})
      }
    }
  }
</script>
