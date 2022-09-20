package com.xixi.mall.api.multishop.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-multishop";

    public static final String INDEX_IMG_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/indexImg";

    public static final String SHOP_DETAIL_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/shopDetail";

}
