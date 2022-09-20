package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import order.vo.ShopCartItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "shopCart")
public interface ShopCartFeignClient {

    /**
     * 获取购物项
     *
     * @return 购物项
     */
    @GetMapping(FeignConstant.SHOP_CART_FEIGN_PREFIX + "/getById")
    ServerResponse<List<ShopCartItemVo>> getCheckedShopCartItems();

    /**
     * 通过购物车id删除用户购物车物品
     *
     * @param shopCartItemIds 购物车id
     * @return
     */
    @DeleteMapping(FeignConstant.SHOP_CART_FEIGN_PREFIX + "/delete_item")
    ServerResponse<Void> deleteItem(@RequestBody List<Long> shopCartItemIds);
}
