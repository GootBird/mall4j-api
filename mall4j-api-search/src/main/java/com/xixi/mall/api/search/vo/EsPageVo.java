package com.xixi.mall.api.search.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class EsPageVo<T> {

    @ApiModelProperty("总页数")
    private Integer pages;

    @ApiModelProperty("总条目数")
    private Long total;

    @ApiModelProperty("结果集")
    private List<T> list;

}
