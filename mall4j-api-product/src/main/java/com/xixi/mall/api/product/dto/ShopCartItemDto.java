package com.xixi.mall.api.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 购物车物品参数
 */
@Getter
@Setter
@Accessors(chain = true)
public class ShopCartItemDto {

    @NotNull(message = "产品ID不能为空")
    @ApiModelProperty(value = "产品ID", required = true)
    private Long spuId;

    @NotNull(message = "skuId不能为空")
    @ApiModelProperty(value = "skuId", required = true)
    private Long skuId;

    @NotNull(message = "商品数量不能为空")
    @Min(value = 1, message = "商品数量不能为空")
    @ApiModelProperty(value = "商品数量", required = true)
    private Integer count;

    @NotNull(message = "店铺id不能为空")
    @ApiModelProperty(value = "店铺id", required = true)
    private Long shopId;

}
