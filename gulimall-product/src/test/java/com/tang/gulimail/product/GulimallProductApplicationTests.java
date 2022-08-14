package com.tang.gulimail.product;

import com.tang.gulimall.product.GulimallProductApplication;
import com.tang.gulimall.product.entity.BrandEntity;
import com.tang.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GulimallProductApplication.class})
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("hello");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
