package com.xixi.mall.api.order.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OrderSimpleAmountInfoBo {

    private Long orderId;

    private Long shopId;

    /**
     * 实际总值
     */
    private Long actualTotal;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 订单关闭原因
     */
    private Integer closeType;

}
