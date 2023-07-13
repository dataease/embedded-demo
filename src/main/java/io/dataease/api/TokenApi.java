package io.dataease.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TokenApi {

    /**
     * appId从dataease系统管理中获取
     */
    private static final String appId = "123456789";
    /**
     * secret从dataease系统管理中获取
     */
    private static final String secret = "987654321";

    /**
     * 获取token需要先从dataease获取appId
     *
     * @param account 用户账号
     * @return
     */
    @GetMapping("/token/{account}")
    public String generate(@PathVariable("account") String account) {
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("account", account).withClaim("appId", appId);
        return builder.sign(algorithm);
    }
}
