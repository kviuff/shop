package com.kviuff.shop;

import com.kviuff.shop.common.bootstrap.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {"com.kviuff.shop"})
@MapperScan(basePackages = "com.kviuff.shop.mapper")
public class ShopKviuffApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShopKviuffApplication.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }
}
