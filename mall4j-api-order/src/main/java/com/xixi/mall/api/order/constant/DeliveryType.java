package com.xixi.mall.api.order.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 配送类型
 */
@Getter
@AllArgsConstructor
public enum DeliveryType {


    /**
     * 无需快递
     */
    NOT_DELIVERY(3);

    private final Integer value;


    public static DeliveryType instance(Integer value) {
        for (DeliveryType statusEnum : values()) {
            if (statusEnum.getValue().equals(value))
                return statusEnum;
        }
        return null;
    }
}
