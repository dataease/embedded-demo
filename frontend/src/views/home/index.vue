<template>
  <div class="home">
    <div class="top">
      <div class="top-left">
        <p class="title normal-font">DataEase&ensp;嵌入式分析体验</p>
        <div class="content normal-font">
          带您了解并探索如何将嵌入式分析集成到您的应用中，<br />您可以在这里体验&ensp;DataEase&ensp;的所有嵌入式分析功能。
        </div>
      </div>
      <div class="top-right">
        <img src="@/assets/images/dataease.png" style="width: auto; max-width: 100%; height: auto; max-height: 100%" />
      </div>
    </div>
    <div class="bottom">
      <div class="card bottom-card" @mouseover="showButtonEvent('design')" @mouseleave="hideButtonEvent('design')">
        <img class="logo-img" src="@/assets/icons/design.png" alt="logo" />
        <p class="title-card normal-font">设计器嵌入</p>
        <div class="content-card normal-font">
          将仪表板或数据大屏设计器嵌入到业务系统中，查看仪表板的同时可对其进行修改，增强系统的自助分析能力。
        </div>
        <div class="button normal-font">
          <el-button color="#426DF2" size="medium" rel="noopener noreferrer" v-on:click="jump('/div/dashboardDesign')">
            开始体验
          </el-button>
        </div>
      </div>
      <div class="card bottom-card" @mouseover="showButtonEvent('dashboard')" @mouseleave="hideButtonEvent('dashboard')">
        <img class="logo-img" src="@/assets/icons/dashboard.png" alt="logo" />
        <p class="title-card normal-font">看板整体嵌入</p>
        <div class="content-card normal-font">
          将制作好的仪表板或数据大屏整体嵌入到业务系统中，支持通过传递参数过滤数据，同时支持联动、跳转、下钻、过滤组件等自助式分析操作。支持与系统之间双向传参。
        </div>
        <div class="button normal-font">
          <el-button color="#426DF2" size="medium" rel="noopener noreferrer" v-on:click="jump('/iframe/dashboard')">
            开始体验
          </el-button>
        </div>
      </div>
      <div class="card bottom-card" @mouseover="showButtonEvent('view')" @mouseleave="hideButtonEvent('view')">
        <img class="logo-img" src="@/assets/icons/view.png" alt="logo" />
        <p class="title-card normal-font">单个图表嵌入</p>
        <div class="content-card normal-font">将单个图表嵌入到系统中，辅助用户进行决策。支持与系统之间双向传参。</div>
        <div class="button normal-font">
          <el-button color="#426DF2" size="medium" rel="noopener noreferrer" v-on:click="jump('/div/view')"> 开始体验 </el-button>
        </div>
      </div>
      <div class="card bottom-card" @mouseover="showButtonEvent('module')" @mouseleave="hideButtonEvent('module')">
        <img class="logo-img" src="@/assets/icons/module.png" alt="logo" />
        <p class="title-card normal-font">模块级别嵌入</p>
        <div class="content-card normal-font">
          将&ensp;DataEase&ensp;的数据源、数据集、仪表板、数据大屏等页面拆开完整嵌入至第三方系统，直接提供数据分析所需要的全部功能。
        </div>
        <div class="button normal-font">
          <el-button
            color="#426DF2"
            size="medium"
            rel="noopener noreferrer"
            v-on:click="jump('/iframe/module/datasource_module')"
          >
            开始体验
          </el-button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts" name="home">
import { ref } from "vue";

import { useRouter } from "vue-router";

const router = useRouter();

const jump = function (url: any) {
  router.push(url);
};

let showDesignButton = ref(false);
let showDashboardButton = ref(false);
let showViewButton = ref(false);
let showModuleButton = ref(false);

const showButtonEvent = function (type: any) {
  if (type === "design") {
    showDesignButton.value = true;
  }
  if (type === "dashboard") {
    showDashboardButton.value = true;
  }
  if (type === "view") {
    showViewButton.value = true;
  }
  if (type === "module") {
    showModuleButton.value = true;
  }
};
const hideButtonEvent = function (type: any) {
  if (type === "design") {
    showDesignButton.value = false;
  }
  if (type === "dashboard") {
    showDashboardButton.value = false;
  }
  if (type === "view") {
    showViewButton.value = false;
  }
  if (type === "module") {
    showModuleButton.value = false;
  }
};
</script>

<style scoped lang="scss">
@import "./index.scss";
</style>
