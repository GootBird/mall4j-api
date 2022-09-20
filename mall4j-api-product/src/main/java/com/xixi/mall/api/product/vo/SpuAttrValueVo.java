package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 商品规格属性关联信息VO
 */
@Setter
@Getter
@ToString
public class SpuAttrValueVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品属性值关联信息id")
    private Long spuAttrValueId;

    @ApiModelProperty("商品id")
    private Long spuId;

    @ApiModelProperty("规格属性id")
    private Long attrId;

    @ApiModelProperty("规格属性名称")
    private String attrName;

    @ApiModelProperty("规格属性值id")
    private Long attrValueId;

    @ApiModelProperty("规格属性值名称")
    private String attrValueName;

    @ApiModelProperty("搜索类型 0:不需要，1:需要")
    private Integer searchType;

}
