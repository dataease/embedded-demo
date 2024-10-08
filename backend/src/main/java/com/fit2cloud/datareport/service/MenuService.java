package com.fit2cloud.datareport.service;

import com.alibaba.fastjson.JSONArray;

import java.io.IOException;

public interface MenuService {

   JSONArray listMenus() throws IOException;

}
