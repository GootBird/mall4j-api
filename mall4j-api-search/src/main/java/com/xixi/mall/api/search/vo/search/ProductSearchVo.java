package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class ProductSearchVo {


    @ApiModelProperty(value = "店铺信息")
    private ShopInfoSearchVo shopInfo;

    @ApiModelProperty(value = "规格属性列表")
    private List<AttrSearchVo> attrs;

    @ApiModelProperty(value = "品牌列表信息")
    private List<BrandSearchVo> brands;

    @ApiModelProperty(value = "spu列表信息")
    private List<SpuSearchVo> spus;

    @ApiModelProperty(value = "分类列表信息")
    private List<CategorySearchVo> categorys;

}
