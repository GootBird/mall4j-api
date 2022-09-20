package com.xixi.mall.api.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xixi.mall.common.core.handle.ImgJsonSerializerHandle;
import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * spu信息VO
 */
@Setter
@Getter
@ToString
public class SpuVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("spu id")
    private Long spuId;

    @ApiModelProperty("品牌ID")
    private Long brandId;

    @ApiModelProperty("分类ID")
    private Long categoryId;

    @ApiModelProperty("店铺分类ID")
    private Long shopCategoryId;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("spu名称")
    private String name;

    @ApiModelProperty("卖点")
    private String sellingPoint;

    @ApiModelProperty("商品介绍主图")
    @JsonSerialize(using = ImgJsonSerializerHandle.class)
    private String mainImgUrl;

    @ApiModelProperty("商品介绍主图 多个图片逗号分隔")
    @JsonSerialize(using = ImgJsonSerializerHandle.class)
    private String imgUrls;

    @ApiModelProperty("售价，整数方式保存")
    private Long priceFee;

    @ApiModelProperty("市场价，整数方式保存")
    private Long marketPriceFee;

    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

    @ApiModelProperty("sku是否含有图片 0无 1有")
    private Integer hasSkuImg;

    @ApiModelProperty("商品详情")
    private String detail;

    @ApiModelProperty("总库存")
    private Integer totalStock;

    @ApiModelProperty("规格属性")
    private List<SpuAttrValueVo> spuAttrValues;

    @ApiModelProperty("sku列表")
    private List<SkuVo> skus;

    @ApiModelProperty("序号")
    private Integer seq;

    @ApiModelProperty("品牌信息")
    private BrandVo brand;

    @ApiModelProperty("商品销量")
    private Integer saleNum;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("分类信息")
    private CategoryVo category;

    @ApiModelProperty("店铺分类信息")
    private CategoryVo shopCategory;

    @ApiModelProperty("分组商品关联id")
    private Long referenceId;

}
