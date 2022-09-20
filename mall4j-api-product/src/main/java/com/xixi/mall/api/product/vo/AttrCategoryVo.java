package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 属性与属性分组关联信息VO
 */
@Setter
@Getter
@ToString
public class AttrCategoryVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("属性与分类关联id")
    private Long attrCategoryId;

    @ApiModelProperty("分类id")
    private Long categoryId;

    @ApiModelProperty("属性id")
    private Long attrId;

}
