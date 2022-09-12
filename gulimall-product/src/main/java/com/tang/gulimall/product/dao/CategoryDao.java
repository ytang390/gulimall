package com.tang.gulimall.product.dao;

import com.tang.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 13:30:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
