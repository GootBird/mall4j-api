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
     * @param spuId spuId
     * @return es保存的商品信息
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/loadEsProductBo")
    ServerResponse<EsProductBo> loadEsProductBo(@RequestParam("spuId") Long spuId);

    /**
     * 根据平台categoryId，获取spuId列表
     *
     * @param shopCategoryIds 商品分类Id
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByShopCategoryIds")
    ServerResponse<List<Long>> getSpuIdsByShopCategoryIds(@RequestParam("shopCategoryIds") List<Long> shopCategoryIds);

    /**
     * 根据categoryId列表，获取spuId列表
     *
     * @param categoryIds 分类Id
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByCategoryIds")
    ServerResponse<List<Long>> getSpuIdsByCategoryIds(@RequestParam("categoryIds") List<Long> categoryIds);

    /**
     * 根据brandId，获取spuId列表
     *
     * @param brandId 品牌Id
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByBrandId")
    ServerResponse<List<Long>> getSpuIdsByBrandId(@RequestParam("brandId") Long brandId);

    /**
     * 根据店铺id，获取spuId列表
     *
     * @param shopId 商品Id
     * @return spuId列表
     */
    @GetMapping(FeignConstant.PRODUCT_FEIGN_PREFIX + "/getSpuIdsByShopId")
    ServerResponse<List<Long>> getSpuIdsByShopId(@RequestParam("shopId") Long shopId);

}
