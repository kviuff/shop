package com.kviuff.shop.mapper.role;

import com.kviuff.shop.common.entity.SysRolePo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 系统角色mapper
 * @author kanglan
 * @date 2018/08/02
 */
@Repository
public interface SysRoleMapper extends BaseMapper<SysRolePo> {

    /**
     * 多条件查询角色列表
     * @param sysRolePo
     * @return
     */
    List<SysRolePo> selectSysRoleByCondition (SysRolePo sysRolePo);

}