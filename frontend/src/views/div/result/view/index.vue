<!--
   1、DIV 嵌入需要引用嵌入式 JS，一般可以在 index.html 里进行引用.
   2、定义一个 DIV 容器，并且设置好宽高。
   3、调用嵌入式 Token 生成接口，获取嵌入式 Token。
   4、获取仪表板/数据大屏 ID以及图表 ID。
   5、创建 DataEaseBi 对象，传入相应参数，渲染 DIV 容器，完成嵌入。

   双向传参应用场景：
   一、第三方系统向 DataEase 传参，依赖于 DataEase 仪表板/数据大屏外部参数实现。
     1、初始化看板时，由第三方系统向 DataEase 传参过滤数据。
      a) 前端传参
      b) 后端传参
     2、查看看板时，可点击第三方系统的查询组件等，过滤 DataEase 的看板数据。
   二、DataEase 向第三方系统传参
     1、查看看板时，可点击 DataEase 里的各个组件，向第三方系统传递当前点击的内容。
-->
<template>
  <div class="card content-box">
    <div style="width: 100%; height: 100%" id="div-view"></div>
  </div>
</template>
<script setup lang="ts" name="view">

import {getToken} from "@/api/common";
//仪表板 ID / 数据大屏 ID
let dvId = "";
//图表 ID
let chartId = "";
//DataEase 访问地址
let baseUrl = "";


getToken().then(result => {
  const dataease = new DataEaseBi("ViewWrapper", {
    baseUrl: baseUrl,
    token: result,
    dvId: dvId,
    chartId: chartId,
    busiFlag: "dashboard"
  });

  dataease.initialize({container: "#div-view"});

})
</script>
<style scoped lang="scss">
@import "index";
</style>
@/api/hook
