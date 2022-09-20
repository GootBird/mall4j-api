package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * sku信息VO
 */
@Setter
@Getter
@ToString
public class SkuVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("属性id")
    private Long skuId;

    @ApiModelProperty("SPU id")
    private Long spuId;

    @ApiModelProperty("多个销售属性值id逗号分隔")
    private String attrs;

    @ApiModelProperty("sku名称")
    private String skuName;

    @ApiModelProperty("banner图片")
    private String imgUrl;

    @ApiModelProperty("售价，整数方式保存")
    private Long priceFee;

    @ApiModelProperty("市场价，整数方式保存")
    private Long marketPriceFee;

    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

    @ApiModelProperty("库存")
    private Integer stock;

    @ApiModelProperty("商品编码")
    private String partyCode;

    @ApiModelProperty("商品条形码")
    private String modelId;

    @ApiModelProperty("商品重量")
    private BigDecimal weight;

    @ApiModelProperty("商品体积")
    private BigDecimal volume;

    @ApiModelProperty("当前sku规格列表")
    private List<SpuSkuAttrValueVo> spuSkuAttrValues;

}
