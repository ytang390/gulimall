package com.tang.gulimall.coupon.dao;

import com.tang.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 15:37:14
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
