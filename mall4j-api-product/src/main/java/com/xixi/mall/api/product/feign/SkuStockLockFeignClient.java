package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.api.product.dto.SkuStockLockDto;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "skuStockLock")
public interface SkuStockLockFeignClient {

    /**
     * 锁定库存
     *
     * @param skuStockLocks 参数
     * @return 是否成功
     */
    @PostMapping(FeignConstant.SKU_STOCK_LOCK_FEIGN_PREFIX + "/lock")
    ServerResponse<Void> lock(@RequestBody List<SkuStockLockDto> skuStockLocks);

}
