package com.xixi.mall.api.multishop.bo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * es交互店铺详情
 */
@Setter
@Getter
@ToString
public class EsShopDetailBo extends BaseVo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("店铺id")
    private Long shopId;

    @ApiModelProperty("店铺类型1自营店 2普通店")
    private Integer type;

    @ApiModelProperty("店铺名称")
    private String shopName;

    @ApiModelProperty("店铺logo")
    private String shopLogo;

    @ApiModelProperty("店铺状态(-1:未开通 0: 停业中 1:营业中)")
    private Integer shopStatus;

}
