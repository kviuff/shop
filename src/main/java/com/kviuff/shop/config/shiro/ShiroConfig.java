//package com.kviuff.shop.config.shiro;
//
//import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
//import org.apache.shiro.mgt.DefaultSubjectDAO;
//import org.apache.shiro.mgt.SecurityManager;
//import org.apache.shiro.mgt.SubjectFactory;
//import org.apache.shiro.session.mgt.DefaultSessionManager;
//import org.apache.shiro.session.mgt.SessionManager;
//import org.apache.shiro.spring.LifecycleBeanPostProcessor;
//import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.filter.authc.UserFilter;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;
//import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.Filter;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
////@Configuration
//public class ShiroConfig {
//
//    @Bean(name="shiroFilter")
//    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager manager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//
//        Map<String, Filter> filters = new LinkedHashMap<String, Filter>();
//        filters.put("system", new UserFilter());
//        shiroFilterFactoryBean.setFilters(filters);
//
//        shiroFilterFactoryBean.setSecurityManager(manager);
//        //配置访问权限
//        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//        //登录
//        filterChainDefinitionMap.put("/login", "anon");
//        filterChainDefinitionMap.put("/doLogin", "anon");
//        //登出
//        filterChainDefinitionMap.put("/logout", "anon");
//        //静态资源
//        filterChainDefinitionMap.put("/static/**","anon");
//
//        filterChainDefinitionMap.put("/**", "anon");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//
//        shiroFilterFactoryBean.setLoginUrl("/login");
//        //登录成功后要跳转的连接
//        shiroFilterFactoryBean.setSuccessUrl("/home");
//        //未授权界面
//        shiroFilterFactoryBean.setUnauthorizedUrl("/404");
//        return shiroFilterFactoryBean;
//    }
//
//    @Bean(name = "subjectFactory")
//    public SubjectFactory subjectFactory(){
//        return new DefaultWebSubjectFactory();
//    }
//    //配置自定义的权限登录器
//    @Bean(name="userPasswordRealm")
//    public UserPasswordRealm userPasswordRealm() {
//        UserPasswordRealm userPasswordRealm = new UserPasswordRealm();
//        userPasswordRealm.setCachingEnabled(false);
//        return userPasswordRealm;
//    }
//
//    /**
//     * 会话管理器
//     * @return
//     */
//    @Bean(name = "sessionManager")
//    public SessionManager sessionManager(){
//        DefaultSessionManager defaultSessionManager = new DefaultSessionManager();
//        defaultSessionManager.setSessionValidationSchedulerEnabled(false);
//        return defaultSessionManager;
//    }
//
//    //配置核心安全事务管理器
//    @Bean(name="securityManager")
//    public SecurityManager securityManager(@Qualifier("userPasswordRealm") UserPasswordRealm userPasswordRealm,
//                                           @Qualifier("sessionManager") SessionManager sessionManager,
//                                           @Qualifier("subjectFactory") SubjectFactory subjectFactory) {
//        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
//        manager.setRealm(userPasswordRealm);
//        manager.setSessionManager(sessionManager);
//        manager.setSubjectFactory(subjectFactory);
//
//        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
//        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
//        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
//        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
//        manager.setSubjectDAO(subjectDAO);
//
//        return manager;
//    }
//
//    @Bean
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
//        return new LifecycleBeanPostProcessor();
//    }
//    @Bean
//    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
//        DefaultAdvisorAutoProxyCreator creator=new DefaultAdvisorAutoProxyCreator();
//        creator.setProxyTargetClass(true);
//        return creator;
//    }
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("securityManager") SecurityManager manager) {
//        AuthorizationAttributeSourceAdvisor advisor=new AuthorizationAttributeSourceAdvisor();
//        advisor.setSecurityManager(manager);
//        return advisor;
//    }
//}
