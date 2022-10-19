package com.xixi.mall.api.order.bo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
public class EsOrderBo {

    @ApiModelProperty(value = "订单项", required = true)
    private List<EsOrderItemBo> orderItems;

    @ApiModelProperty(value = "用户id", required = true)
    private Long userId;

    @ApiModelProperty(value = "订单号", required = true)
    private Long orderId;

    @ApiModelProperty(value = "总价", required = true)
    private Long actualTotal;

    @ApiModelProperty(value = "订单状态", required = true)
    private Integer status;

    @ApiModelProperty(value = "配送类型 :无需快递", required = true)
    private Integer deliveryType;

    @ApiModelProperty(value = "店铺名称", required = true)
    private String shopName;

    @ApiModelProperty(value = "店铺id", required = true)
    private Long shopId;

    @ApiModelProperty(value = "订单创建时间", required = true)
    private Date createTime;

    @ApiModelProperty(value = "商品总数", required = true)
    private Integer allCount;

    @ApiModelProperty(value = "收货人姓名")
    private String consignee;

    @ApiModelProperty(value = "收货人手机号")
    private String mobile;
    /**
     * 用户订单地址Id
     */
    private Long orderAddrId;

    /**
     * 总值
     */
    private Long total;

    /**
     * 支付方式 请参考枚举PayType
     */
    private Integer payType;

    /**
     * 订单关闭原因 1-超时未支付  4-买家取消 15-已通过货到付款交易
     */
    private Integer closeType;

    /**
     * 发货时间
     */
    private Date updateTime;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 完成时间
     */
    private Date finallyTime;

    /**
     * 取消时间
     */
    private Date cancelTime;

    /**
     * 是否已支付，1.已支付0.未支付
     */
    private Integer isPayed;

    /**
     * 用户订单删除状态，0：没有删除， 1：回收站， 2：永久删除
     */
    private Integer deleteStatus;

}
