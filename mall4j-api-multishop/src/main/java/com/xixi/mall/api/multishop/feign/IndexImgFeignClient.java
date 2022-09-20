package com.xixi.mall.api.multishop.feign;

import com.xixi.mall.api.multishop.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "indexImg")
public interface IndexImgFeignClient {

    /**
     * 根据商品d删除轮播图信息
     *
     * @param spuId  商品id
     * @param shopId 店鋪id
     * @return void
     */
    @GetMapping(value = FeignConstant.INDEX_IMG_FEIGN_PREFIX + "/deleteBySpuId")
    ServerResponse<Void> deleteBySpuId(@RequestParam("spuId") Long spuId, @RequestParam("shopId") Long shopId);

}
