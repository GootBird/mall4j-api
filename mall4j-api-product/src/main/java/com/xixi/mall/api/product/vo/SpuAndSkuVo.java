package com.xixi.mall.api.product.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SpuAndSkuVo {

    @ApiModelProperty("spu信息")
    private SpuVo spu;

    @ApiModelProperty("sku信息")
    private SkuVo sku;

}
