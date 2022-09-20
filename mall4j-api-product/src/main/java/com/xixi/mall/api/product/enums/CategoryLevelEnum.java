package com.xixi.mall.api.product.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 等级
 */
@Getter
@AllArgsConstructor
public enum CategoryLevelEnum {

    /**
     * 第一级
     */
    First(0),

    /**
     * 第二级
     */
    SECOND(1),

    /**
     * 第三级
     */
    THIRD(2);

    private final Integer value;

}
