package com.fit2cloud.datareport.controller;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RestController
public class IndexController {


    /**
     * 嵌入式 appId
     */
    private static String appId = "";

    /**
     * 嵌入式 appSecret
     */
    private static String appSecret = "";

    /**
     * DataEase 用户名
     */
    private static String account = "";

    /**
     * 获取 DataEase 嵌入式 Token
     * DataEase 嵌入式 Token 使用的是 JWT 认证，由 appId、appSecret 以及 DataEase 用户名生成。
     * Java 程序可直接引用 java-jwt (https://mvnrepository.com/artifact/com.auth0/java-jwt) 依赖，其它后端语言可自行百度加密代码。
     * 注意，嵌入式 Token 的过期时间默认为 480 分钟，可通过修改 application.yml 进行调整
     * 配置参数名称为 dataease.embedded-exp
     *
     */
    @GetMapping("/api/token")
    public String generateToken () {

        String user = "小王";
        List<String> users = Arrays.asList("小王","小李");
        String status = "ASSIGNED";

        Algorithm algorithm = Algorithm.HMAC256(appSecret);
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("account", account).withClaim("appId", appId);
        builder.withIssuedAt(new Date());
        //只过滤 user = 小王
        //builder.withClaim("user", user);
        //过滤 user = 小王 或者 小李的数据
        //builder.withClaim("user", JSONObject.toJSONString(users));
        //过滤 user = 小王 或者 小李 以及 设备状态等于 ASSIGNED 的数据
        //builder.withClaim("user", JSONObject.toJSONString(users)).withClaim("设备状态", status);
        return builder.sign(algorithm);


    }





}
