package com.kviuff.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {"com.kviuff.shop"})
@MapperScan(basePackages = "com.kviuff.shop.mapper")
public class ShopKviuffApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopKviuffApplication.class, args);
    }
}
