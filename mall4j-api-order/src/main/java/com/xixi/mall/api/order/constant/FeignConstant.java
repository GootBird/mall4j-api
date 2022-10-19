package com.xixi.mall.api.order.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-order";

    public static final String ORDER_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/order";

}
