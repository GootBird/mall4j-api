package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 属性信息VO
 */
@Setter
@Getter
@ToString
public class AttrVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("attr id")
    private Long attrId;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("属性名称")
    private String name;

    @ApiModelProperty("属性描述")
    private String desc;

    @ApiModelProperty("作为搜索参数 0:不需要，1:需要")
    private Integer searchType;

    @ApiModelProperty("属性类型 0:销售属性，1:基本属性")
    private Integer attrType;

    @ApiModelProperty("属性值列表")
    private List<AttrValueVo> attrValues;

    @ApiModelProperty("分类列表")
    private List<CategoryVo> categories;

}
