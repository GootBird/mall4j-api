package com.xixi.mall.api.search.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class ProductSearchDto {

    @ApiModelProperty(value = "页面传递过来的全文匹配关键字")
    private String keyword;

    @ApiModelProperty(value = "品牌id,可以多选")
    private String brandIds;

    @ApiModelProperty(value = "商家一级分类id")
    private Long shopPrimaryCategoryId;

    @ApiModelProperty(value = "商家二级分类id")
    private Long shopSecondaryCategoryId;

    @ApiModelProperty(value = "平台一级分类id")
    private Long primaryCategoryId;

    @ApiModelProperty(value = "平台三级分类id")
    private Long categoryId;

    @ApiModelProperty(value = "排序：1新品,2销量倒序,3销量正序,4商品价格倒序,5商品价格正序,6评论(暂无评论)")
    private Integer sort;

    @ApiModelProperty(value = "自营店 1：自营店 2：非自营店")
    private Integer selfShop;

    @ApiModelProperty(value = "是否显示有货")
    private Integer hasStock;

    @ApiModelProperty(value = "价格区间查询-最低价")
    private Long minPrice;

    @ApiModelProperty(value = "价格区间查询-最高价")
    private Long maxPrice;

    @ApiModelProperty(value = "店铺id")
    private Long shopId;

    @ApiModelProperty(value = "属性值ids(属性之间用^拼接；属性于属性值id用_拼接；多个属性值id间用,拼接)")
    private String attrIds;

    @ApiModelProperty(value = "商品状态")
    private Integer spuStatus;

    @ApiModelProperty(value = "属性值ids(多个id间使用 , 分隔)")
    private String attrValueIds;

    @ApiModelProperty(value = "spuId列表")
    private List<Long> spuIds;

    @ApiModelProperty(value = "销量区间查询-最低销量")
    private Long minSaleNum;

    @ApiModelProperty(value = "销量区间查询-最高销量")
    private Long maxSaleNum;

    @ApiModelProperty(value = "商品编码列表（逗号分隔）")
    private String partyCodes;

    @ApiModelProperty(value = "商品条形码列表（逗号分隔）")
    private String modelIds;

    @ApiModelProperty(value = "0.全部  1.销售中  2.已售罄  3.已下架")
    private Integer dataType;

    @ApiModelProperty(value = "当前页")
    private Integer pageNum;

    @ApiModelProperty(value = "每页大小")
    private Integer pageSize;

    /**
     * 对应SearchTypeEnum
     * 搜索类型 1：用户端搜索  2：店铺spu列表 3.平台spu管理列表
     */
    private Integer searchType;

    /**
     * 搜索属性信息
     */
    private Map<String, List<String>> attrMap;

}
