package com.kviuff.shop.service.user;

import com.kviuff.shop.common.entity.SysRoleMenuPo;
import com.kviuff.shop.common.entity.SysUserRolePo;

import java.util.List;

/**
 * 用户角色接口
 * @author kanglan
 * @Date   2018/08/13
 */
public interface SysUserRoleService {

    /**
     * 批量插入
     * @param sysUserRolePoList
     */
    void insertBatch (List<SysUserRolePo> sysUserRolePoList);

    /**
     * 根据用户编码删除用户角色配置
     * @param sysUserRolePo
     */
    void deleteByExample (SysUserRolePo sysUserRolePo);
}
