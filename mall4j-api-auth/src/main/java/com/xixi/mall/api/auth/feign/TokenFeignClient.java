package com.xixi.mall.api.auth.feign;

import com.xixi.mall.api.auth.bo.UserInfoInTokenBo;
import com.xixi.mall.api.auth.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "token")
public interface TokenFeignClient {

    /**
     * 校验token并返回token保存的用户信息
     *
     * @param accessToken accessToken
     * @return token保存的用户信息
     */
    @GetMapping(FeignConstant.TOKEN_FEIGN_PREFIX + "/checkToken")
    ServerResponse<UserInfoInTokenBo> checkToken(@RequestParam("accessToken") String accessToken);

}
