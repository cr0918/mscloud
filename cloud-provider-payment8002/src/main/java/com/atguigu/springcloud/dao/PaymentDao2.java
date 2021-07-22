package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper  //import org.apache.ibatis.annotations.Mapper;mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
public interface PaymentDao2
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}


