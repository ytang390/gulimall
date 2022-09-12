package com.tang.gulimall.order.dao;

import com.tang.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 15:56:23
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
