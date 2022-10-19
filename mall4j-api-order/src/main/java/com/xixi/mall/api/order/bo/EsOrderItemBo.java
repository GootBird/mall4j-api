package com.xixi.mall.api.order.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class EsOrderItemBo {
    @ApiModelProperty(value = "商品图片", required = true)
    private String pic;

    @ApiModelProperty(value = "商品名称", required = true)
    private String spuName;

    @ApiModelProperty(value = "商品数量", required = true)
    private Integer count;

    @ApiModelProperty(value = "商品价格", required = true)
    private Long price;

    @ApiModelProperty(value = "skuId", required = true)
    private Long skuId;

    @ApiModelProperty(value = "skuName", required = true)
    private String skuName;

    @ApiModelProperty(value = "订单项id", required = true)
    private Long orderItemId;

    @ApiModelProperty(value = "商品id", required = true)
    private Long spuId;

    /**
     * 店铺id
     */
    private Long shopId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 单个orderItem的配送类型  ：无需快递
     */
    private Integer deliveryType;

    /**
     * 加入购物车时间
     */
    private Date shopCartTime;

    /**
     * 商品总金额
     */
    private Long spuTotalAmount;

}
