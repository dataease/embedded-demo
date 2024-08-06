package io.dataease.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dataease.api.dto.SettingVO;
import io.dataease.api.utils.SettingUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class TokenApi {


    /**
     * 获取token需要先从dataease获取appId
     * @param account 用户账号
     * @return
     */
    @GetMapping("/token/{account}")
    public String generate(@PathVariable("account") String account) throws JsonProcessingException {
        SettingVO vo = SettingUtils.read();
        Algorithm algorithm = Algorithm.HMAC256(vo.getAppSecret());
        JWTCreator.Builder builder = JWT.create();
        List<String> ipList = new ArrayList<>();
        ipList.add("192.168.1.10");
        ipList.add("192.168.1.20");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(ipList);
        builder.withClaim("account", account).withClaim("appId", vo.getAppId()).withClaim("arg1", "果粒果汁").withClaim("arg2", json);
        builder.withIssuedAt(new Date());
        return builder.sign(algorithm);
    }
}
