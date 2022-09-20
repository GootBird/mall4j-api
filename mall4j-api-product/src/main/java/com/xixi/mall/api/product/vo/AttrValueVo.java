package com.xixi.mall.api.product.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 属性值信息VO
 */
@Setter
@Getter
@ToString
public class AttrValueVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("属性id")
    private Long attrValueId;

    @ApiModelProperty("属性ID")
    private Long attrId;

    @ApiModelProperty("属性值")
    private String value;

}
