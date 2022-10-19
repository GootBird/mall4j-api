package com.xixi.mall.api.product.constant;

import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;

public class FeignConstant {

    public static final String SERVICE_NAME = "mall4j-product";

    public static final String CATEGORY_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/category";

    public static final String PRODUCT_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/product";

    public static final String SHOP_CART_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/shopCart";

    public static final String SKU_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/sku";

    public static final String SKU_STOCK_LOCK_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/skuStockLock";

    public static final String SPU_FEIGN_PREFIX = FeignInsideAuthConfig.FEIGN_URL + "/spu";

}
