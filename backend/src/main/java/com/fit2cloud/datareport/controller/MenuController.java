package com.fit2cloud.datareport.controller;

import com.alibaba.fastjson.JSONArray;
import com.fit2cloud.datareport.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
public class MenuController {

    @Resource
    private MenuService menuService;


    @GetMapping("/api/menu/list")
    JSONArray listMenus () throws IOException {
        return menuService.listMenus();
    }


}
