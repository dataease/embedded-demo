package com.fit2cloud.datareport.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.fit2cloud.datareport.util.HttpUtil;
import com.fit2cloud.datareport.util.RsdUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DataEaseAPIDemo {
    /**
     * DataEase 访问地址
     */
    private static final String dataeaseEndpoint = "http://mock.fit2cloud.com/dataease/";
    /**
     * Access Key
     */
    private static final String accessKey = "";
    /**
     * Secret Key
     */
    private static final String secretKey = "";
    /**
     * 仪表板列表接口
     */
    private static final String dashboardList = "/de2api/dataVisualization/tree";

    public static void main(String[] args) throws Exception {
        String signature = RsdUtil.aesEncrypt(accessKey + "|" + UUID.randomUUID() + "|" + System.currentTimeMillis(), secretKey, accessKey);
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("accessKey", accessKey).withClaim("signature", signature);
        String xDeAskToken = builder.sign(algorithm);

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Accept", "application/json;charset=UTF-8");
        headers.put("accessKey", accessKey);
        headers.put("signature", signature);
        headers.put("x-de-ask-token", xDeAskToken);

        String requestBody = "{\"busiFlag\":\"dashboard\"}";
        System.out.println(HttpUtil.request(headers, "POST", requestBody, dataeaseEndpoint + dashboardList).toString());
    }
}
