<template>
  <div class="button normal-font" style="padding-bottom:5px;">
    <el-button color="#426DF2" size="medium" rel="noopener noreferrer" @click="loginDataEase">登录 DataEase</el-button>
    <el-button color="#426DF2" size="medium" rel="noopener noreferrer" @click="logoutDataEase">登出 DataEase</el-button>
  </div>
  <div class="card content-box">
    <iframe style="width: 100%; height: 100%;border: 0;" src="http://mock.fit2cloud.com/dataease/" />
  </div>
</template>
<script setup lang="ts" name="simulated">
import { getSimulatedToken } from "@/api/common";
const loginDataEase = function () {
  getSimulatedToken().then(result => {
    let timestamp = new Date().getTime();

    let token = '{"c":' + timestamp + ',"e":253402300799000,"v":"\\"' + result.token + '\\""}'
    let custom_auth_logout_url = '{"c":' + timestamp + ',"e":253402300799000,"v":"\\"' + 'http://mock.fit2cloud.com/dataease/' + '\\""}'
    let exp = '{"c":' + timestamp + ',"e":253402300799000,"v":"\\"' + result.exp + '\\""}'

    localStorage.setItem("user.token", token);
    localStorage.setItem("user.exp", exp);
    localStorage.setItem("custom_auth_logout_url", custom_auth_logout_url);
    document.getElementsByTagName("iframe")[0].src = 'http://mock.fit2cloud.com/dataease/';
  })
}

const logoutDataEase = function () {
  let custom_auth_logout_url = localStorage.getItem("custom_auth_logout_url");
  let jsonObj = JSON.parse(custom_auth_logout_url);
  let logout_url = jsonObj.v.replace(/['"]/g, '');
  localStorage.clear();
  document.getElementsByTagName("iframe")[0].src = logout_url;
}
</script>
<style scoped lang="scss">
@import "./index.scss";
</style>
@/api/hook
