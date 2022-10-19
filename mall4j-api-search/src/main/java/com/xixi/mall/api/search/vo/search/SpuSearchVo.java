package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SpuSearchVo {

    @ApiModelProperty(value = "商品id")
    private Long spuId;

    @ApiModelProperty(value = "商品名称")
    private String spuName;

    @ApiModelProperty(value = "卖点")
    private String sellingPoint;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty(value = "商品售价")
    private Long priceFee;

    @ApiModelProperty(value = "市场价，整数方式保存")
    private Long marketPriceFee;

    @ApiModelProperty(value = "是否有库存")
    private Boolean hasStock;

    @ApiModelProperty(value = "销量")
    private Integer saleNum;

    @ApiModelProperty("商品介绍主图")
    private String mainImgUrl;

}
