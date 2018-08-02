//package com.kviuff.shop.config.mapper;
//
//import com.kviuff.shop.common.mapper.BaseMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import tk.mybatis.spring.mapper.MapperScannerConfigurer;
//
//import java.util.Properties;
//
//@Configuration
//@Slf4j
//public class MapperConfig {
//    /**
//     * Mybatis通用Mapper配置
//     * @return
//     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        log.info("加载MYBATIS配置---MapperScannerConfigurer");
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.kviuff.shop.mapper");
//        Properties propertiesMapper = new Properties();
//        propertiesMapper.setProperty("mappers",BaseMapper.class.getName());
//        propertiesMapper.setProperty("IDENTITY","SELECT REPLACE(UUID(),'-','')");
//        propertiesMapper.setProperty("ORDER","BEFORE");
//        propertiesMapper.setProperty("notEmpty", "true");
//        propertiesMapper.setProperty("IDENTITY", "MYSQL");
//        mapperScannerConfigurer.setProperties(propertiesMapper);
//        return mapperScannerConfigurer;
//    }
//}
