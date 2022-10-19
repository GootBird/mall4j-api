package com.xixi.mall.api.search.vo.search;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author FrozenWatermelon
 * @date 2020/11/16
 */
public class ProductSearchVo {


    @ApiModelProperty(value = "店铺信息")
    private ShopInfoSearchVo shopInfo;

    @ApiModelProperty(value = "规格属性列表")
    private List<AttrSearchVo> attrs;

    @ApiModelProperty(value = "品牌列表信息")
    private List<BrandSearchVo> brands;

    @ApiModelProperty(value = "spu列表信息")
    private List<SpuSearchVo> spus;

    @ApiModelProperty(value = "分类列表信息")
    private List<CategorySearchVo> categorys;

    public ShopInfoSearchVo getShopInfo() {
        return shopInfo;
    }

    public void setShopInfo(ShopInfoSearchVo shopInfo) {
        this.shopInfo = shopInfo;
    }

    public List<AttrSearchVo> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AttrSearchVo> attrs) {
        this.attrs = attrs;
    }

    public List<BrandSearchVo> getBrands() {
        return brands;
    }

    public void setBrands(List<BrandSearchVo> brands) {
        this.brands = brands;
    }

    public List<SpuSearchVo> getSpus() {
        return spus;
    }

    public void setSpus(List<SpuSearchVo> spus) {
        this.spus = spus;
    }

    public List<CategorySearchVo> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<CategorySearchVo> categorys) {
        this.categorys = categorys;
    }

    @Override
    public String toString() {
        return "ProductSearchVO{" +
                "shopInfo=" + shopInfo +
                ", attrs=" + attrs +
                ", brands=" + brands +
                ", spus=" + spus +
                '}';
    }
}
