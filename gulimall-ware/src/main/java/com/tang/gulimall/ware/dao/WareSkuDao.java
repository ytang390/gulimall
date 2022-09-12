package com.tang.gulimall.ware.dao;

import com.tang.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 16:04:25
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
