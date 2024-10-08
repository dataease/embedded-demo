<!--
   一、公共链接嵌入（数据不敏感或内网环境可用，使用 ticket 的方式会较为安全）。
   1、获取数据大屏公共链接
   2、定义一个 iframe 容器，并且设置好宽高。
   3、设置 iframe 容器的 src 为数据大屏公共链接。

   二、DataEase 嵌入式推荐的 iframe 嵌入
   1、iframe 嵌入需要先在 application.yml 里添加 origin-list
   2、定义一个 iframe 容器，并且设置好宽高。
   3、调用嵌入式 Token 生成接口，获取嵌入式 Token。
   4、获取数据大屏 ID。
   5、构建初始化参数。
   6、监听来自 DataEase 事件的 msgOrigin ，如果 msgOrigin 为 de-fit2cloud ，则通过 postMessage 发送初始化参数，渲染看板。

   双向传参应用场景：
   一、第三方系统向 DataEase 传参，依赖于 DataEase 仪表板/数据大屏外部参数实现。
     1、初始化看板时，由第三方系统向 DataEase 传参过滤数据。
      a) 公共链接拼接 attachParams 过滤数据。
      b) 公共链接使用 ticket 设置参数过滤数据。
      b) DataEase 推荐的 iframe 嵌入方式前端传参过滤数据。
      b) DataEase 推荐的 iframe 嵌入方式后端传参过滤数据。
     2、查看看板时，可点击第三方系统的查询组件等，过滤 DataEase 的看板数据。
   二、DataEase 向第三方系统传参
     1、查看看板时，可点击 DataEase 里的各个组件，向第三方系统传递当前点击的内容。
-->
<template>
  <div class="card-iframe content-box">
      <iframe style="height: 100%; width: 100%; border: 0" src=""  id="iframe-dashboard-view" ></iframe>
  </div>
</template>
<script setup lang="ts" name="dashboard">
import {getToken} from "@/api/common";
import {nextTick , onUnmounted} from "vue";

//数据大屏 ID
let dvId = "";
//固定写法，如 https://embedded-bi-inner.dataease.cn/#/chart-view
let url = "";

const params = {
  busiFlag: "dataV",
  dvId: dvId,
  type: "Dashboard",
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
