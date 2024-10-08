<!--
   1、DIV 嵌入需要引用嵌入式 JS，一般可以在 index.html 里进行引用.
   2、定义一个 DIV 容器，并且设置好宽高。
   3、调用嵌入式 Token 生成接口，获取嵌入式 Token。
   4、创建 DataEaseBi 对象，传入相应参数，渲染 DIV 容器，完成嵌入。

-->
<template>
  <div class="card content-box">
    <div style="width: 100%; height: 100%" id="div-dataV-module-view"></div>
  </div>
</template>
<script setup lang="ts" name="dataVModule">

import {getToken} from "@/api/common";

//DataEase 访问地址
let baseUrl = "";

getToken().then(result => {
  const dataease = new DataEaseBi("ScreenPanel", {
    baseUrl: baseUrl,
    token: result
  });

  dataease.initialize({container: "#div-dataV-module-view"});

})
</script>
<style scoped lang="scss">
@import "index";
</style>
@/api/hook
