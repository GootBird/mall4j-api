package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.api.product.vo.SpuAndSkuVo;
import com.xixi.mall.api.product.vo.SpuVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "spu")
public interface SpuFeignClient {

    /**
     * 通过spuId需要搜索的商品
     *
     * @param spuId spuid
     * @return 商品信息(spuId, name, mainImgUrl)
     */
    @GetMapping(FeignConstant.SPU_FEIGN_PREFIX + "/getById")
    ServerResponse<SpuVo> getById(@RequestParam("spuId") Long spuId);

    /**
     * 通过spuId需要搜索的商品
     *
     * @param spuId spuId
     * @param skuId skuId
     * @return 商品信息
     */
    @GetMapping(FeignConstant.SPU_FEIGN_PREFIX + "/getSpuAndSkuById")
    ServerResponse<SpuAndSkuVo> getSpuAndSkuById(@RequestParam("spuId") Long spuId, @RequestParam("skuId") Long skuId);


    /**
     * 根据spuId获取spu列表（所需字段：spuId、shopId、name、mainImgUrl）
     * 根据店铺id获取spu列表
     *
     * @param spuIds    商品ids
     * @param spuName   商品名称
     * @param isFailure 是否失效
     * @return 商品列表信息
     */
    @GetMapping(FeignConstant.SPU_FEIGN_PREFIX + "/getSpusBySpuIds")
    ServerResponse<List<SpuVo>> getSpusBySpuIds(@RequestParam("spuIds") List<Long> spuIds,
                                                @RequestParam(value = "spuName", defaultValue = "") String spuName,
                                                @RequestParam(value = "isFailure", defaultValue = "1") Integer isFailure);


}
