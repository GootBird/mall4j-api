package com.xixi.mall.api.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 订单快递信息DTO
 */
@Setter
@Getter
@ToString
public class DeliveryOrderDto {

    @ApiModelProperty(value = "deliveryOrderId")
    private Long deliveryOrderId;

    @NotNull(message = "订单号不能为空")
    @ApiModelProperty(value = "订单号", required = true)
    private Long orderId;

    @NotNull(message = "发货方式不能为空")
    @ApiModelProperty(value = "发货方式", required = true)
    private Integer deliveryType;

    private List<DeliveryOrderItemDto> selectOrderItems;

}
