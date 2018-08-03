package com.kviuff.shop.common.bootstrap;

import org.springframework.context.ApplicationContext;

/**
 * 上下文工具类
 * @author kanglan
 * @date 2018/08/02
 */
public class SpringContextUtil {

    private static ApplicationContext applicationContext;

    //获取上下文
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //设置上下文
    public static void setApplicationContext(ApplicationContext applicationContext) {
        if(SpringContextUtil.applicationContext == null) {
            SpringContextUtil.applicationContext = applicationContext;
        }
    }

    //通过名字获取上下文中的bean
    public static Object getBean(String name){
        return applicationContext.getBean(name);
    }

    //通过类型获取上下文中的bean
    public static Object getBean(Class<?> requiredType){
        return applicationContext.getBean(requiredType);
    }

}
