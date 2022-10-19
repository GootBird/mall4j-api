package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author FrozenWatermelon
 * @date 2020/11/17
 */
public class AttrSearchVo {

    @ApiModelProperty(value = "规格id")
    private Long attrId;

    @ApiModelProperty(value = "规格名")
    private String attrName;

    @ApiModelProperty(value = "规格值列表")
    private List<AttrValueSearchVo> attrValues;

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public List<AttrValueSearchVo> getAttrValues() {
        return attrValues;
    }

    public void setAttrValues(List<AttrValueSearchVo> attrValues) {
        this.attrValues = attrValues;
    }

    @Override
    public String toString() {
        return "AttrVO{" +
                "attrId=" + attrId +
                ", attrName='" + attrName + '\'' +
                ", attrValues=" + attrValues +
                '}';
    }
}
