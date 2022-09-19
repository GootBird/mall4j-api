package com.xixi.mall.api.rabc.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-rabc";

    public static final String PERMISSION_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/permission";

    public static final String USER_ROLE_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/userRole";

}
