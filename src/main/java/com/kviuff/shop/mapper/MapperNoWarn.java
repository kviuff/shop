//package com.kviuff.shop.mapper;
//
//import org.apache.ibatis.mapping.DatabaseIdProvider;
//import org.apache.ibatis.plugin.Interceptor;
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ResourceLoader;
//import tk.mybatis.mapper.autoconfigure.ConfigurationCustomizer;
//import tk.mybatis.mapper.autoconfigure.MapperAutoConfiguration;
//import tk.mybatis.mapper.autoconfigure.MybatisProperties;
//
//import java.util.List;
//
//@Configuration
//public class MapperNoWarn extends MapperAutoConfiguration {
//    public MapperNoWarn(MybatisProperties properties, ObjectProvider<Interceptor[]> interceptorsProvider, ResourceLoader resourceLoader, ObjectProvider<DatabaseIdProvider> databaseIdProvider, ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider) {
//        super(properties, interceptorsProvider, resourceLoader, databaseIdProvider, configurationCustomizersProvider);
//    }
//}
