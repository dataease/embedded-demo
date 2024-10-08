package com.fit2cloud.datareport.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fit2cloud.datareport.service.MenuService;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @program: data-report
 * @description:
 * @author: wanziliang
 * @create: 2023-09-04 11:29
 **/
@Service
public class MenuServiceImpl implements MenuService {

    @Override
    public JSONArray listMenus() throws IOException {
        InputStream inputStream = null;
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        if (patternResolver.getResource("menu.json").exists()) {
            inputStream = patternResolver.getResource("menu.json").getInputStream();
            String str = IOUtils.toString(new BufferedReader(new InputStreamReader(inputStream, UTF_8)));
            JSONArray menuArray = JSON.parseArray(str);
            return menuArray;
        }
        return null;
    }


}
