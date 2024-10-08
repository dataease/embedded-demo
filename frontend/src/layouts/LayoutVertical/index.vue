<!-- 纵向布局 -->
<template>
  <el-container>
    <el-header>
      <div class="logo flx-center">
        <img class="logo-img" src="@/assets/images/logo.svg" alt="logo" />
        <span v-show="!isCollapse" class="logo-text">{{ title }}</span>
      </div>
      <ToolBarRight />
    </el-header>
    <el-container class="layout">
      <el-aside>
        <!--              :default-openeds="['/div', '/iframe', '/other', '/iframe/module']"-->
        <div class="aside-box" :style="{ width: isCollapse ? '65px' : '230px' }">
          <el-scrollbar>
            <el-menu :default-active="activeMenu" :collapse="isCollapse" :router="false" :collapse-transition="false">
              <SubMenu :menu-list="menuList" />
            </el-menu>
          </el-scrollbar>
        </div>
      </el-aside>
      <el-container>
        <Main />
      </el-container>
    </el-container>
  </el-container>
</template>

<script setup lang="ts" name="layoutVertical">
import { computed } from "vue";
import { useRoute } from "vue-router";
import { useAuthStore } from "@/stores/modules/auth";
import { useGlobalStore } from "@/stores/modules/global";
import Main from "@/layouts/components/Main/index.vue";
import ToolBarRight from "@/layouts/components/Header/ToolBarRight.vue";
import SubMenu from "@/layouts/components/Menu/SubMenu.vue";

const title = import.meta.env.VITE_GLOB_APP_TITLE;

const route = useRoute();
const authStore = useAuthStore();
const globalStore = useGlobalStore();
const isCollapse = computed(() => globalStore.isCollapse);
const menuList = computed(() => authStore.showMenuListGet);
const activeMenu = computed(() => (route.meta.activeMenu ? route.meta.activeMenu : route.path) as string);
</script>

<style scoped lang="scss">
@import "./index.scss";
</style>
