package com.xixi.mall.api.product.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xixi.mall.common.core.handle.ImgJsonSerializerHandle;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 分类信息VO
 */
@Setter
@Getter
@ToString
public class CategoryVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分类id")
    private Long categoryId;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("父ID")
    private Long parentId;

    @ApiModelProperty("分类名称")
    private String name;

    @ApiModelProperty("分类描述")
    private String desc;

    @ApiModelProperty("分类地址{parent_id}-{child_id},...")
    private String path;

    @ApiModelProperty("状态 1:enable, 0:disable, -1:deleted")
    private Integer status;

    @JsonSerialize(using = ImgJsonSerializerHandle.class)
    @ApiModelProperty("分类图标")
    private String icon;

    @JsonSerialize(using = ImgJsonSerializerHandle.class)
    @ApiModelProperty("分类的显示图片")
    private String imgUrl;

    @ApiModelProperty("分类层级 从0开始")
    private Integer level;

    @ApiModelProperty("排序")
    private Integer seq;

    @ApiModelProperty("上级分类名称")
    private List<String> pathNames;

    @ApiModelProperty("子分类列表")
    private List<CategoryVo> categories;

}
