package com.tang.gulimall.order.dao;

import com.tang.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 15:56:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
