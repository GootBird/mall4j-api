package com.xixi.mall.api.user.vo;

import com.xixi.mall.common.core.webbase.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 省市区地区信息VO
 */
@Setter
@Getter
@ToString
public class AreaVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty()
    private Long areaId;

    @ApiModelProperty("地址")
    private String areaName;

    @ApiModelProperty("上级地址")
    private Long parentId;

    @ApiModelProperty("等级（从1开始）")
    private Integer level;

    private Integer check;

    /**
     * 下级地址集合
     */
    private List<AreaVo> areas;

    /**
     * 下级地址的areaId
     */
    private List<Long> areaIds;

}
