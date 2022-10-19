package com.xixi.mall.api.search.feign;

import com.xixi.mall.api.search.vo.search.EsOrderVo;
import com.xixi.mall.common.core.feign.FeignInsideAuthConfig;
import com.xixi.mall.common.core.webbase.dto.OrderSearchDto;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 订单搜索
 */
@FeignClient(value = "mall4j-search", contextId = "searchOrder")
public interface SearchOrderFeignClient {


    /**
     * 订单搜索
     *
     * @param orderSearch 订单搜索参数
     * @return 订单列表
     */
    @PutMapping(value = FeignInsideAuthConfig. + "/insider/searchOrder/getOrderPage")
    ServerResponse<EsOrderVo> getOrderPage(@RequestBody OrderSearchDto orderSearch);

}
