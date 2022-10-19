package com.xixi.mall.api.order.feign;

import com.xixi.mall.api.order.bo.EsOrderBo;
import com.xixi.mall.api.order.bo.OrderSimpleAmountInfoBo;
import com.xixi.mall.api.order.bo.OrderStatusBo;
import com.xixi.mall.api.order.constant.FeignConstant;
import com.xixi.mall.api.order.vo.OrderAmountVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "order")
public interface OrderFeignClient {


    /**
     * 如果订单没有被取消的话，获取订单金额，否之会获取失败
     *
     * @param orderIds 订单id列表
     * @return 订单金额
     */
    @GetMapping(value = FeignConstant.ORDER_FEIGN_PREFIX + "/getOrdersAmountAndIfNoCanceler")
    ServerResponse<OrderAmountVo> getOrdersAmountAndIfNoCancel(@RequestParam("orderIds") List<Long> orderIds);

    /**
     * 获取订单状态，如果订单状态不存在，则说明订单没有创建
     *
     * @param orderIds 订单id列表
     * @return 订单状态
     */
    @GetMapping(value = FeignConstant.ORDER_FEIGN_PREFIX + "/getOrdersStatus")
    ServerResponse<List<OrderStatusBo>> getOrdersStatus(@RequestParam("orderIds") List<Long> orderIds);

    /**
     * 获取订单中的金额信息
     *
     * @param orderIds 订单id列表
     * @return 订单中的金额信息
     */
    @GetMapping(value = FeignConstant.ORDER_FEIGN_PREFIX + "/getOrdersSimpleAmountInfo")
    ServerResponse<List<OrderSimpleAmountInfoBo>> getOrdersSimpleAmountInfo(@RequestParam("orderIds") List<Long> orderIds);


    /**
     * 获取订单需要保存到es中的数据
     *
     * @param orderId 订单id
     * @return es中的数据
     */
    @GetMapping(value = FeignConstant.ORDER_FEIGN_PREFIX + "/getEsOrder")
    ServerResponse<EsOrderBo> getEsOrder(@RequestParam("orderId") Long orderId);

    /**
     * 支付时更新订单状态
     *
     * @param orderIds 订单id列表
     * @return null
     */
    @GetMapping(value = FeignConstant.ORDER_FEIGN_PREFIX + "/updateOrderState")
    ServerResponse<Void> updateOrderState(@RequestParam("orderIds") List<Long> orderIds);

}
