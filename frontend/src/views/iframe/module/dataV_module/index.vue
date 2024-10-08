<!--
   一、DataEase 嵌入式推荐的 iframe 嵌入
   1、iframe 嵌入需要先在 application.yml 里添加 origin-list
   2、定义一个 iframe 容器，并且设置好宽高。
   3、调用嵌入式 Token 生成接口，获取嵌入式 Token。
   4、构建初始化参数。
   5、监听来自 DataEase 事件的 msgOrigin ，如果 msgOrigin 为 de-fit2cloud ，则通过 postMessage 发送初始化参数，渲染看板。

-->
<template>
  <div class="card-iframe content-box">
    <iframe style="height: 100%; width: 100%; border: 0" src=""  id="iframe-dashboard-view" ></iframe>
  </div>
</template>
<script setup lang="ts" name="dashboard">
import {getToken} from "@/api/common";
import {nextTick , onUnmounted} from "vue";

//固定写法，如 https://embedded-bi-inner.dataease.cn/#/chart-view
let url = "";

const params = {
  type: "ScreenPanel",
  embeddedToken: "",
  "de-embedded": true
}

let iframe = null;

onUnmounted(()=>{
  window.removeEventListener("message",onMessage,false);
})

nextTick(()=>{
  iframe = document.getElementById("iframe-dashboard-view");

  getToken().then(result => {
    params.embeddedToken = result;
    iframe.src = url;

    window.addEventListener("message" , onMessage , false);
  })
})

const onMessage = function (event: any){
  if (event.data?.msgOrigin === "de-fit2cloud") {
    const contentWindow = iframe.contentWindow;
    contentWindow.postMessage(params , "*")
  }
}

</script>
<style scoped lang="scss">
@import "index";
</style>
