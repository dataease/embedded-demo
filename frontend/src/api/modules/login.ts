import http from "@/api";

/**
 * @name 登录模块
 */

// 获取菜单列表
export const getAuthMenuListApi = () => {
  return http.get<Menu.MenuOptions[]>(`/api/menu/list`, {}, { noLoading: true });
};
