package com.xixi.mall.api.user.feign;

import com.xixi.mall.api.user.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import order.vo.UserAddrVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户地址feign连接
 */
@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "userAddr")
public interface UserAddrFeignClient {


    /**
     * 根据地址id获取用户地址信息
     *
     * @param addrId 地址id
     * @return 用户地址信息
     */
    @GetMapping(value = FeignConstant.USER_ADDR_FEIGN_PREFIX + "/getUserAddrByAddrId")
    ServerResponse<UserAddrVo> getUserAddrByAddrId(@RequestParam("addrId") Long addrId);

}
