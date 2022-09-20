package com.xixi.mall.api.user.feign;

import com.xixi.mall.api.user.constant.FeignConstant;
import com.xixi.mall.api.user.vo.UserApiVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 用户信息feign连接
 */
@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "user")
public interface UserFeignClient {

    /**
     * 根据用户id列表，获取用户信息
     *
     * @param userIds 用户id列表
     * @return 用户列表信息
     */
    @GetMapping(value = FeignConstant.USER_FEIGN_PREFIX + "/getUserByUserIds")
    ServerResponse<List<UserApiVo>> getUserByUserIds(@RequestParam("userId") List<Long> userIds);

    /**
     * 根据用户id获取用户详细信息
     *
     * @param userId 用户id
     * @return 用户详细信息
     */
    @GetMapping(value = FeignConstant.USER_FEIGN_PREFIX + "/getUserAndOpenIdsByUserId")
    ServerResponse<UserApiVo> getUserAndOpenIdsByUserId(@RequestParam("userId") Long userId,
                                                        @RequestParam("sysType") Integer sysType);

    /**
     * 获取用户数据
     *
     * @param userId 用户ID
     * @return 用户数据
     */
    @GetMapping(value = FeignConstant.USER_FEIGN_PREFIX + "/getUserData")
    ServerResponse<UserApiVo> getUserData(Long userId);

}
