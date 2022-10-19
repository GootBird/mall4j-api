package com.xixi.mall.api.search.vo.search;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xixi.mall.common.core.handle.ImgJsonSerializerHandle;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ShopInfoSearchVo {

    @ApiModelProperty(value = "店铺名称 搜索华为的时候，可以把华为的旗舰店搜索出来")
    private String shopName;

    @ApiModelProperty(value = "店铺id")
    private Long shopId;

    @ApiModelProperty(value = "店铺logo")
    @JsonSerialize(using = ImgJsonSerializerHandle.class)
    private String shopLogo;

    @ApiModelProperty("店铺类型1自营店 2普通店")
    private Integer type;

}
