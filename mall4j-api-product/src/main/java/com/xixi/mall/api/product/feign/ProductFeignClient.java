package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.bo.EsProductBo;
import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "product")
public interface ProductFeignClient {

    /**
     * 通过spuId需要搜索的商品
     *
     * @param spuId spuid
     * @return es保存的商品信息
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/loadEsProductBO")
    ServerResponse<EsProductBo> loadEsProductBO(@RequestParam("spuId") Long spuId);

    /**
     * 根据平台categoryId，获取spuId列表
     *
     * @param shopCategoryIds
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByShopCategoryIds")
    ServerResponse<List<Long>> getSpuIdsByShopCategoryIds(@RequestParam("shopCategoryIds") List<Long> shopCategoryIds);

    /**
     * 根据categoryId列表，获取spuId列表
     *
     * @param categoryIds
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByCategoryIds")
    ServerResponse<List<Long>> getSpuIdsByCategoryIds(@RequestParam("categoryIds") List<Long> categoryIds);

    /**
     * 根据brandId，获取spuId列表
     *
     * @param brandId
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByBrandId")
    ServerResponse<List<Long>> getSpuIdsByBrandId(@RequestParam("brandId") Long brandId);

    /**
     * 根据店铺id，获取spuId列表
     *
     * @param shopId
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByShopId")
    ServerResponse<List<Long>> getSpuIdsByShopId(@RequestParam("shopId") Long shopId);

}
