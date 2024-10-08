package com.fit2cloud.datareport.controller;

import com.alibaba.fastjson.JSON;
import com.fit2cloud.datareport.dto.SimulatedTokenDTO;
import com.fit2cloud.datareport.util.HttpUtil;
import com.fit2cloud.datareport.util.RsdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SimulatedController {

    /**
     * 填写DataEase的访问地址
     */
    private static final String dataeaseEndpoint = "http://mock.fit2cloud.com/dataease/";
    /**
     * 密钥获取
     */
    private static final String keyPath = "/de2api/dekey";
    /**
     * token 获取
     */
    private static final String tokenPath = "/de2api/login/localLogin";

    /**
     * 模拟登陆要使用的用户
     */
    private static final String USERNAME = "";
    /**
     * 模拟登陆用户密码
     */
    private static final String PASSWORD = "";

    private static final String PK_SEPARATOR = "-pk_separator-";

    @GetMapping("/simulated/token")
    public SimulatedTokenDTO getToken() throws Exception {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json;charset=UTF-8");

        String publicKey = RsdUtil.getDataEaseKey(HttpUtil.request(headers, "GET", "", dataeaseEndpoint + keyPath).toString(), PK_SEPARATOR);
        String username = RsdUtil.encrypt(USERNAME, RsdUtil.getPublicKey(publicKey));
        String password = RsdUtil.encrypt(PASSWORD, RsdUtil.getPublicKey(publicKey));

        String body = "{\n" +
                "  \"name\": \"" + username + "\",\n" +
                "  \"pwd\": \"" + password + "\"\n" +
                "}";
        String token = HttpUtil.request(headers, "POST", body, dataeaseEndpoint + tokenPath).toString();
        return JSON.parseObject(token, SimulatedTokenDTO.class);
    }
}
