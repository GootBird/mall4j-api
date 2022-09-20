package com.xixi.mall.api.product.handle;

import cn.hutool.core.collection.CollectionUtil;
import com.xixi.mall.api.multishop.feign.ShopDetailFeignClient;
import com.xixi.mall.api.product.dto.ShopCartItemDto;
import com.xixi.mall.api.product.feign.ShopCartFeignClient;
import com.xixi.mall.api.product.feign.SpuFeignClient;
import com.xixi.mall.api.product.vo.SkuVo;
import com.xixi.mall.api.product.vo.SpuAndSkuVo;
import com.xixi.mall.api.product.vo.SpuVo;
import com.xixi.mall.common.core.aop.PackResponseEnhance;
import com.xixi.mall.common.core.enums.ResponseEnum;
import com.xixi.mall.common.core.utils.BooleanUtil;
import com.xixi.mall.common.core.utils.ThrowUtils;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import order.vo.ShopCartItemVo;
import order.vo.ShopCartVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 购物车处理器
 */
@Component
public class ShopCartHandle {

    @Resource
    private SpuFeignClient spuFeignClient;

    @Resource
    private ShopCartFeignClient shopCartFeignClient;

    @Resource
    private ShopDetailFeignClient shopDetailFeignClient;

    /**
     * 获取购物项组装信息
     *
     * @param cartItemDto 购物项参数
     * @return 购物项组装信息
     */
    public ServerResponse<List<ShopCartItemVo>> getShopCartItems(ShopCartItemDto cartItemDto) {
        return PackResponseEnhance.enhance(() -> {
            // 当立即购买时，没有提交的订单是没有购物车信息的
            if (cartItemDto != null) {
                return ThrowUtils.checkResAndGetData(conversionShopCartItem(cartItemDto));
            }
            // 从购物车提交订单
            List<ShopCartItemVo> cartItemVos = ThrowUtils.checkResAndGetData(shopCartFeignClient.getCheckedShopCartItems());

            // 请选择您需要的商品加入购物车
            ThrowUtils.checkIsTrue(CollectionUtil.isNotEmpty(cartItemVos), ResponseEnum.SHOP_CART_NOT_EXIST);

            // 返回购物车选择的商品信息
            return cartItemVos;
        });
    }

    /**
     * 将参数转换成组装好的购物项
     *
     * @param carItemDto 购物项参数
     * @return 组装好的购物项
     */
    public ServerResponse<List<ShopCartItemVo>> conversionShopCartItem(ShopCartItemDto carItemDto) {
        return PackResponseEnhance.enhance(() -> {

            SpuAndSkuVo spuAndSkuVo = ThrowUtils.checkResAndGetData(
                    spuFeignClient.getSpuAndSkuById(carItemDto.getSpuId(), carItemDto.getSkuId())
            );

            SkuVo sku = spuAndSkuVo.getSku();
            SpuVo spu = spuAndSkuVo.getSpu();

            // 拿到购物车的所有item
            ShopCartItemVo shopCartItem = new ShopCartItemVo()
                    .setCartItemId(0L)
                    .setSkuId(carItemDto.getSkuId())
                    .setCount(carItemDto.getCount())
                    .setSpuId(carItemDto.getSpuId())
                    .setShopId(carItemDto.getShopId())
                    .setSkuPriceFee(sku.getPriceFee())
                    .setSkuName(sku.getSkuName())
                    .setSpuName(spu.getName())
                    .setCreateTime(new Date())
                    .setImgUrl(BooleanUtil.isTrue(spu.getHasSkuImg()) ? sku.getImgUrl() : spu.getMainImgUrl());

            shopCartItem.setTotalAmount(shopCartItem.getCount() * shopCartItem.getSkuPriceFee());

            return Collections.singletonList(shopCartItem);
        });
    }


    /**
     * 将参数转换成组装好的购物项
     *
     * @param shopCartItems 订单参数
     * @return 组装好的购物项
     */
    public List<ShopCartVo> conversionShopCart(List<ShopCartItemVo> shopCartItems) {

        return shopCartItems
                .stream()
                .collect(Collectors.groupingBy(ShopCartItemVo::getShopId))
                .entrySet()
                .stream()
                .map(entry -> {

                    Long shopId = entry.getKey(); //根据店铺ID划分item
                    List<ShopCartItemVo> cartItemVos = entry.getValue();
                    ShopCartVo shopCart = buildShopCart(shopId, cartItemVos); // 构建每个店铺的购物车信息
                    shopCart.setShopId(shopId);
                    shopCart.setShopCartItem(cartItemVos);
                    String shopName = ThrowUtils.checkResAndGetData(
                            shopDetailFeignClient.getShopNameByShopId(shopId)
                    );
                    shopCart.setShopName(shopName);
                    return shopCart;
                })
                .collect(Collectors.toList());
    }


    private ShopCartVo buildShopCart(Long shopId, List<ShopCartItemVo> shopCartItems) {
        ShopCartVo shopCart = new ShopCartVo();
        shopCart.setShopId(shopId);
        long total = 0L;
        int totalCount = 0;
        for (ShopCartItemVo shopCartItem : shopCartItems) {
            total += shopCartItem.getTotalAmount();
            totalCount += shopCartItem.getCount();
        }
        shopCart.setTotal(total);
        shopCart.setTotalCount(totalCount);
        return shopCart;
    }


}
