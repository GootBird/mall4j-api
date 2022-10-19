package com.xixi.mall.api.search.feign;

import com.xixi.mall.api.search.constant.FeignConstant;
import com.xixi.mall.api.search.dto.EsPageDto;
import com.xixi.mall.api.search.dto.ProductSearchDto;
import com.xixi.mall.api.search.vo.EsPageVo;
import com.xixi.mall.api.search.vo.search.ProductSearchVo;
import com.xixi.mall.api.search.vo.search.SpuSearchVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商品搜索feign连接
 */
@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "searchSpu")
public interface SearchSpuFeignClient {

    /**
     * 商品搜索
     *
     * @param pageDto          分页信息
     * @param productSearchDto 搜索参数
     * @return 商品搜索数据
     */
    @GetMapping(value = FeignConstant.SEARCH_SPU_FEIGN_PREFIX + "/search")
    ServerResponse<EsPageVo<ProductSearchVo>> search(@RequestParam("pageDto") EsPageDto pageDto,
                                                     @RequestParam("productSearchDto") ProductSearchDto productSearchDto);

    /**
     * 根据spuId列表， 获取spu列表信息
     *
     * @param spuIds 商品id列表
     * @return 商品列表
     */
    @GetMapping(value = FeignConstant.SEARCH_SPU_FEIGN_PREFIX + "/getSpusBySpuIds")
    ServerResponse<List<SpuSearchVo>> getSpusBySpuIds(@RequestParam("spuIds") List<Long> spuIds);

    /**
     * 根据店铺，获取商品分页信息
     *
     * @param pageNum  分页数
     * @param pageSize 每页大小
     * @param shopId   店铺id
     * @return
     */
    @GetMapping(value = FeignConstant.SEARCH_SPU_FEIGN_PREFIX + "/spuPage")
    ServerResponse<EsPageVo<ProductSearchVo>> spuPage(@RequestParam("pageNum") Integer pageNum,
                                                      @RequestParam("pageSize") Integer pageSize,
                                                      @RequestParam("shopId") Long shopId);

    /**
     * 根据店铺id列表获取每个店铺的spu列表
     *
     * @param shopIds 店铺id列表
     * @param size    每个店铺返回的商品数量
     * @return spu搜索数据
     */
    @GetMapping(value = FeignConstant.SEARCH_SPU_FEIGN_PREFIX + "/limitSizeListByShopIds")
    ServerResponse<List<SpuSearchVo>> limitSizeListByShopIds(@RequestParam("shopIds") List<Long> shopIds,
                                                             @RequestParam("size") Integer size);

}
