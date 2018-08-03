package com.kviuff.shop.service.user;


import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysUserPo;

/**
 * 用户接口
 * @author kanglan
 * @Date   2018/06/01
 */
public interface SysUserService {

    /**
     * 保存用户信息
     * @param sysUserPo
     */
    void saveUser (SysUserPo sysUserPo);

    /**
     * 删除用户信息
     * @param userCode
     */
    void deleteUser (String userCode);

    /**
     * 更新用户信息
     * @param sysUserPo
     */
    void updateUser (SysUserPo sysUserPo);

    /**
     * 查询用户信息
     * @param userCode
     * @return
     */
    SysUserPo getUser (String userCode);

    /**
     * 分页查询
     * @param sysUserPo
     * @return
     */
    PageInfo<SysUserPo> findPageList(SysUserPo sysUserPo);
}
