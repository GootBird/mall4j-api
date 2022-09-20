package com.xixi.mall.api.user.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-user";

    public static final String USER_ADDR_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/userAddr";

    public static final String USER_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/user";

}
