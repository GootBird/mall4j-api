package com.xixi.mall.api.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SkuStockLockDto {

    @NotNull(message = "产品ID不能为空")
    @ApiModelProperty(value = "产品ID", required = true)
    private Long spuId;

    @NotNull(message = "skuId不能为空")
    @ApiModelProperty(value = "skuId", required = true)
    private Long skuId;

    @NotNull(message = "orderId不能为空")
    @ApiModelProperty(value = "orderId", required = true)
    private Long orderId;

    @NotNull(message = "商品数量不能为空")
    @Min(value = 1, message = "商品数量不能为空")
    @ApiModelProperty(value = "商品数量", required = true)
    private Integer count;

}
