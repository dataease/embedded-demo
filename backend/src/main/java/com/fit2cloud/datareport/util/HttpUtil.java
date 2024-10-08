package com.fit2cloud.datareport.util;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Map;

public class HttpUtil {
    public static Object request(Map<String, String> headers, String method, String requestBody, String requestUrl) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();

        Request.Builder builder = new Request.Builder().url(requestUrl);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestBody);
        builder.method(method, StringUtils.isEmpty(requestBody) ? null : body);

        headers.forEach(builder::addHeader);
        Request request = builder.build();
        try {
            Response response = client.newCall(request).execute();
            return JSONObject.parseObject(response.body().string()).get("data");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
