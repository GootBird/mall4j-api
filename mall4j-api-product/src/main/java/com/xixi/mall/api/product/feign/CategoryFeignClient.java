package com.xixi.mall.api.product.feign;

import com.xixi.mall.api.product.constant.FeignConstant;
import com.xixi.mall.api.product.vo.CategoryVo;
import com.xixi.mall.common.core.webbase.vo.ServerResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = FeignConstant.SERVICE_NAME, contextId = "category")
public interface CategoryFeignClient {

    /**
     * 获取所有一级分类信息
     *
     * @return 一级分类信息
     */
    @GetMapping(FeignConstant.CATEGORY_FEIGN_PREFIX + "/listByOneLevel")
    ServerResponse<List<CategoryVo>> listByOneLevel();

    /**
     * 根据上级id，获取子分类id列表
     *
     * @param categoryId
     * @return
     */
    @GetMapping(FeignConstant.CATEGORY_FEIGN_PREFIX + "/listCategoryId")
    ServerResponse<List<Long>> listCategoryId(@RequestParam("categoryId") Long categoryId);
}
