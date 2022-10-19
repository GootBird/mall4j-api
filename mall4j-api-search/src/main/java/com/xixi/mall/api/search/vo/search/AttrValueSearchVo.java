package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AttrValueSearchVo {

    @ApiModelProperty(value = "规格值id")
    private Long attrValueId;

    @ApiModelProperty(value = "规格值名称")
    private String attrValueName;

}
