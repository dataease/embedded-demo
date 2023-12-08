package io.dataease.api;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import io.dataease.api.dto.SettingVO;
import io.dataease.api.utils.SettingUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TokenApi {


    /**
     * 获取token需要先从dataease获取appId
     * @param account 用户账号
     * @return
     */
    @GetMapping("/token/{account}")
    public String generate(@PathVariable("account") String account) {
        SettingVO vo = SettingUtils.read();
        Algorithm algorithm = Algorithm.HMAC256(vo.getAppSecret());
        JWTCreator.Builder builder = JWT.create();
        builder.withClaim("account", account).withClaim("appId", vo.getAppId());
        return builder.sign(algorithm);
    }
}
