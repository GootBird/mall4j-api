package com.xixi.mall.api.search.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-search";

    public static final String SEARCH_ORDER_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/searchOrder";

    public static final String SEARCH_SPU_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/searchSpu";

}
