package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.api.product.vo.SkuVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "sku")
public interface SkuFeignClient {

    /**
     * 通过skuId获取sku信息
     *
     * @param skuId skuId
     * @return sku信息
     */
    @GetMapping(value = FeignConstant.SKU_FEIGN_PREFIX + "/getById")
    ServerResponse<SkuVo> getById(@RequestParam("skuId") Long skuId);

}
