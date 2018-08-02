package com.kviuff.shop.mapper.menu;

import com.kviuff.shop.common.entity.SysMenuPo;
import com.kviuff.shop.common.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 系统菜单mapper
 * @author kanglan
 * @date 2018/07/23
 */
@Repository
public interface MenuMapper extends BaseMapper<SysMenuPo> {

    /**
     * 根据条件查询菜单列表
     * @param sysMenuPo
     * @return
     */
    List<SysMenuPo> getMenuListByParams (SysMenuPo sysMenuPo);

}
