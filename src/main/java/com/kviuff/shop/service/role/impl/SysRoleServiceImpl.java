package com.kviuff.shop.service.role.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysRolePo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.utils.IdGen;
import com.kviuff.shop.common.utils.PageUtils;
import com.kviuff.shop.mapper.role.SysRoleMapper;
import com.kviuff.shop.service.role.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 角色实现
 *
 * @author kanglan
 * @date 2018/08/09
 */
@Service
@Slf4j
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    /**
     * 保存角色
     * @param sysRolePo
     */
    @Override
    public void insertRole(SysRolePo sysRolePo) {
        sysRolePo.setRoleCode(IdGen.uuid());
        sysRoleMapper.insert(sysRolePo);
    }

    /**
     * 删除角色
     * @param roleCode 角色编码
     */
    @Override
    public void deleteRole(String roleCode) {
        sysRoleMapper.deleteByPrimaryKey(roleCode);
    }

    /**
     * 修改角色
     * @param sysRolePo
     */
    @Override
    public void updateRole(SysRolePo sysRolePo) {
        sysRoleMapper.updateByPrimaryKey(sysRolePo);
    }

    /**
     * 查询角色信息
     * @param roleCoce
     * @return
     */
    @Override
    public SysRolePo selectRole(String roleCoce) {
        return sysRoleMapper.selectByPrimaryKey(roleCoce);
    }

    /**
     * 分页查询
     * @param sysRolePo
     * @return
     */
    @Override
    public PageInfo<SysRolePo> findPageList(SysRolePo sysRolePo) {
        PageHelper.startPage(sysRolePo.getPageNo(), sysRolePo.getPageSize());
        List<SysRolePo> sysRolePoList = sysRoleMapper.selectSysRoleByCondition(sysRolePo);
        return PageUtils.pageInstance(sysRolePoList);
    }
}
