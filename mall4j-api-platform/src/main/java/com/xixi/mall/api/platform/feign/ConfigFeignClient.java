package com.xixi.mall.api.platform.feign;

import com.xixi.mall.api.platform.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "config")
public interface ConfigFeignClient {


    /**
     * 获取配置信息
     *
     * @param key key
     * @return 配置信息json
     */
    @GetMapping(FeignConstant.CONFIG_FEIGN_PREFIX + "/getConfig")
    ServerResponse<String> getConfig(@RequestParam("key") String key);

}
