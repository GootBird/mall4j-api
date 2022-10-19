package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BrandSearchVo {

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "品牌图片")
    private String brandImg;

}
