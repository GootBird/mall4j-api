package com.xixi.mall.api.order.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单状态
 */
@Getter
@AllArgsConstructor
public enum OrderStatus {

    /**
     * 没有付款.待付款
     */
    UNPAY(1),

    /**
     * 已经付款,但卖家没有发货.待发货
     */
    PADYED(2),

    /**
     * 发货，导致实际库存减少，没有确认收货.待收货
     */
    CONSIGNMENT(3),

    /**
     * 订单确认收货成功，购买数增加1.
     */
    SUCCESS(5),

    /**
     * 交易失败,还原库存
     */
    CLOSE(6);

    private final Integer value;

    public static OrderStatus instance(Integer value) {
        for (OrderStatus statusEnum : values()) {
            if (statusEnum.getValue().equals(value)) {
                return statusEnum;
            }
        }
        return null;
    }
}
