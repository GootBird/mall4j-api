package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 商品sku销售属性关联信息VO
 */
@Setter
@Getter
@ToString
public class SpuSkuAttrValueVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品sku销售属性关联信息id")
    private Integer spuSkuAttrId;

    @ApiModelProperty("SPU ID")
    private Long spuId;

    @ApiModelProperty("SKU ID")
    private Long skuId;

    @ApiModelProperty("销售属性ID")
    private Integer attrId;

    @ApiModelProperty("销售属性名称")
    private String attrName;

    @ApiModelProperty("销售属性值ID")
    private Integer attrValueId;

    @ApiModelProperty("销售属性值")
    private String attrValueName;

    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

}
