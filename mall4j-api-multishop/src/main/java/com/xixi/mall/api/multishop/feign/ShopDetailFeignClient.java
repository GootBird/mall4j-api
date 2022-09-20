package com.xixi.mall.api.multishop.feign;

import com.xixi.mall.api.multishop.bo.EsShopDetailBo;
import com.xixi.mall.api.multishop.constant.FeignConstant;
import com.xixi.mall.api.multishop.vo.ShopDetailVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "shopDetail")
public interface ShopDetailFeignClient {


    /**
     * 根据店铺id获取店铺名称
     *
     * @param shopId 店铺id
     * @return 店铺名称
     */
    @GetMapping(FeignConstant.SHOP_DETAIL_FEIGN_PREFIX + "/getShopNameByShopId")
    ServerResponse<String> getShopNameByShopId(@RequestParam("shopId") Long shopId);

    /**
     * 根据店铺id获取店铺信息
     *
     * @param shopId 店铺id
     * @return 店铺信息
     */
    @GetMapping(FeignConstant.SHOP_DETAIL_FEIGN_PREFIX + "/getShopByShopId")
    ServerResponse<EsShopDetailBo> getShopByShopId(@RequestParam("shopId") Long shopId);

    /**
     * 根据店铺id列表， 获取店铺列表信息
     *
     * @param shopIds 店铺id列表
     * @return 店铺列表信息
     */
    @GetMapping(FeignConstant.SHOP_DETAIL_FEIGN_PREFIX + "/listByShopIds")
    ServerResponse<List<ShopDetailVo>> listByShopIds(@RequestParam("shopIds") List<Long> shopIds);

    /**
     * 获取店铺信息及扩展信息
     *
     * @param shopId 店铺id
     * @return 店铺信息及扩展信息
     */
    @GetMapping(FeignConstant.SHOP_DETAIL_FEIGN_PREFIX + "/getShopExtension")
    ServerResponse<EsShopDetailBo> shopExtensionData(@RequestParam("shopId") Long shopId);

    /**
     * 获取店铺信息及扩展信息
     *
     * @param shopIds  店铺ids
     * @param shopName 店铺名称
     * @return 店铺信息列表
     */
    @GetMapping(FeignConstant.SHOP_DETAIL_FEIGN_PREFIX + "/getShopDetailByShopIdAndShopName")
    ServerResponse<List<ShopDetailVo>> getShopDetailByShopIdAndShopName(@RequestParam("shopIds") List<Long> shopIds,
                                                                        @RequestParam(value = "shopName", defaultValue = "") String shopName);


}
