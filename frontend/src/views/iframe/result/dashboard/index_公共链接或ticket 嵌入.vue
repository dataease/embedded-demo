<!--
   一、公共链接嵌入（数据不敏感或内网环境可用，使用 ticket 的方式会较为安全）。
   1、获取仪表板公共链接
   2、定义一个 iframe 容器，并且设置好宽高。
   3、设置 iframe 容器的 src 为仪表板公共链接。

   二、DataEase 嵌入式推荐的 iframe 嵌入
   1、iframe 嵌入需要先在 application.yml 里添加 origin-list
   2、定义一个 iframe 容器，并且设置好宽高。
   3、调用嵌入式 Token 生成接口，获取嵌入式 Token。
   4、获取仪表板 ID。
   5、构建初始化参数。
   6、监听来自 DataEase 事件的 msgOrigin ，如果 msgOrigin 为 de-fit2cloud ，则通过 postMessage 发送初始化参数，渲染看板。
-->
<template>
  <div class="card content-box">
    <iframe style="height: 100%; width: 100%; border: 0" src="https://embedded-bi-inner.dataease.cn/#/de-link/uY6HGgCD?ticket=DcPFNBft"  id="iframe-dashboard-view" ></iframe>
  </div>
</template>
<script setup lang="ts" name="dashboard">
</script>
<style scoped lang="scss">
@import "index";
</style>
