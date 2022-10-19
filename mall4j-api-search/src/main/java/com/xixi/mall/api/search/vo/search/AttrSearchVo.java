package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class AttrSearchVo {

    @ApiModelProperty(value = "规格id")
    private Long attrId;

    @ApiModelProperty(value = "规格名")
    private String attrName;

    @ApiModelProperty(value = "规格值列表")
    private List<AttrValueSearchVo> attrValues;

}
