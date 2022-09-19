package com.xixi.mall.api.auth.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-auth";

    public static final String ACCOUNT_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/account";

    public static final String TOKEN_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/token";

}
