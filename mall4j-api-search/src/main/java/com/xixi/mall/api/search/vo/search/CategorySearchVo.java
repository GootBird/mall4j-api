package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CategorySearchVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分类id")
    private Long categoryId;

    @ApiModelProperty("分类名称")
    private String name;

}
