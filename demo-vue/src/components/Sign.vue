<template>
    <div>
        *手機： <input type="text" v-model="signForm.phone_number" placeholder="請輸入手機號碼"/>
        <br><br>
        *密碼： <input type="password" v-model="signForm.password" placeholder="請輸入密碼"/>
        <br><br>
        用戶名:<input type="text" v-model="signForm.username" placeholder="請輸入用戶名"/>
        <br><br>
        <button v-on:click="sign">註冊</button>
    </div>
  </template>

<script>
export default {
  name: 'Sign',
  data () {
    return {
      signForm: {
        phone_number: '',
        password: '',
        username: ''
      },
      responseResult: []
    }
  },
  methods: {
    sign () {
      this.$axios
        .post('/sign', {
          phone_number: this.signForm.phone_number,
          password: this.signForm.password,
          username: this.signForm.username
        })
        .then(successResponse => {
          if (successResponse.data.code === 200) {
            this.$router.replace({path: '/index'})
          }
        })
        .catch(failResponse => {
        })
    }
  }
}
</script>
