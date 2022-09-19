package com.xixi.mall.api.rabc.feign;

import com.xixi.mall.api.rabc.constant.FeignConstant;
import com.xixi.mall.api.rabc.dto.UserRoleDto;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "userRole")
public interface UserRoleFeignClient {

    /**
     * 保存用户角色关联信息
     *
     * @param userRoleDTO 用户角色关联信息
     * @return void
     */
    @PostMapping(FeignConstant.USER_ROLE_FEIGN_PREFIX + "/saveByUserIdAndSysType")
    ServerResponse<Void> saveByUserIdAndSysType(@RequestBody UserRoleDto userRoleDTO);

    /**
     * 更新用户角色关联信息
     *
     * @param userRoleDTO 用户角色关联信息
     * @return void
     */
    @PutMapping(FeignConstant.USER_ROLE_FEIGN_PREFIX + "/updateByUserIdAndSysType")
    ServerResponse<Void> updateByUserIdAndSysType(@RequestBody UserRoleDto userRoleDTO);

    /**
     * 删除用户角色关联信息
     *
     * @param userId 用户id
     * @return void
     */
    @DeleteMapping(FeignConstant.USER_ROLE_FEIGN_PREFIX + "/deleteByUserIdAndSysType")
    ServerResponse<Void> deleteByUserIdAndSysType(@RequestParam("userId") Long userId);

    /**
     * 获取用户角色关联信息
     *
     * @param userId 用户id
     * @return 用户角色关联ids
     */
    @GetMapping(FeignConstant.USER_ROLE_FEIGN_PREFIX + "/getRoleIds")
    ServerResponse<List<Long>> getRoleIds(@RequestParam("userId") Long userId);

}
