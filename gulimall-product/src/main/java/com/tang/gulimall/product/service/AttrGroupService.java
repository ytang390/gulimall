package com.tang.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tang.common.utils.PageUtils;
import com.tang.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author tangyi
 * @email ytang390@gmail.com
 * @date 2022-08-14 13:30:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

