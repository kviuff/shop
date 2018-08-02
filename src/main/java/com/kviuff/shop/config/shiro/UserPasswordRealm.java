//package com.kviuff.shop.config.shiro;
//
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
///**
// * @desctiption:
// * @auther: zhoujianhong
// * @date: 2018/5/13 12:38
// */
//public class UserPasswordRealm extends AuthorizingRealm {
//
//    @Override
//    public boolean supports(AuthenticationToken token) {
//        return token instanceof UsernamePasswordToken;
//    }
//
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        //根据用户名查找角色，请根据需求实现
//        String appId = (String) principals.getPrimaryPrincipal();
//        SimpleAuthorizationInfo authorizationInfo =  new SimpleAuthorizationInfo();
//        authorizationInfo.addRole("api");
//        return authorizationInfo;
//    }
//
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
//        //然后进行客户端消息摘要和服务器端消息摘要的匹配
//        return new SimpleAuthenticationInfo(
//                usernamePasswordToken.getUsername(),
//                usernamePasswordToken.getPassword(),
//                getName());
//    }
//
//}
