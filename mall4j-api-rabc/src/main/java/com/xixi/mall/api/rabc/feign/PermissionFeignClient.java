package com.xixi.mall.api.rabc.feign;

import com.xixi.mall.api.rabc.constant.FeignConstant;
import com.xixi.mall.api.rabc.dto.ClearUserPermissionsCacheDto;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "permission")
public interface PermissionFeignClient {


    /**
     * 校验是否有某个uri的权限
     *
     * @param userId  用户ID
     * @param sysType 系统类型
     * @param uri     uri
     * @param isAdmin 是否管理员
     * @param method  method
     * @return 是否有某个uri的权限
     */
    @GetMapping(FeignConstant.PERMISSION_FEIGN_PREFIX + "/checkPermission")
    ServerResponse<Boolean> checkPermission(@RequestParam("userId") Long userId,
                                            @RequestParam("sysType") Integer sysType,
                                            @RequestParam("uri") String uri,
                                            @RequestParam("isAdmin") Integer isAdmin,
                                            @RequestParam("method") Integer method);

    /**
     * 清除用户权限缓存
     *
     * @param clearUserPermissionsCacheDto dto
     * @return 是否调用成功
     */
    @PostMapping(FeignConstant.PERMISSION_FEIGN_PREFIX + "/clearUserPermissionsCache")
    ServerResponse<Void> clearUserPermissionsCache(@RequestBody ClearUserPermissionsCacheDto clearUserPermissionsCacheDto);

}
