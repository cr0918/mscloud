package com.atguigu.springcloud.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("支付实体信息")
public class Payment implements Serializable
{
    @ApiModelProperty("支付ID")
    private Long id;
    @ApiModelProperty("支付流水")
    private String serial;
}


