package com.xixi.mall.api.order.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderStatusBo {

    private Long orderId;

    private Integer status;

}
