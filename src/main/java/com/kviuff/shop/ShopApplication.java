package com.kviuff.shop;

import com.kviuff.shop.common.bootstrap.SpringContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = {"com.kviuff.shop"})
@EnableTransactionManagement
@MapperScan(basePackages = "com.kviuff.shop.mapper")
public class ShopApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShopApplication.class, args);
        SpringContextUtil.setApplicationContext(applicationContext);
    }
}
