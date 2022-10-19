package com.xixi.mall.api.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 物流订单项信息DTO
 */
@Setter
@Getter
@ToString
public class DeliveryOrderItemDto {

    @ApiModelProperty("id")
    private Long orderItemId;

    @ApiModelProperty("商品图片")
    private String pic;

    @ApiModelProperty("商品名称")
    private String spuName;

    @ApiModelProperty("发货改变的数量")
    private Integer changeNum;

}
