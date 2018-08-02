package com.kviuff.shop.service.menu;

import com.kviuff.shop.common.entity.SysMenuPo;

import java.util.List;

/**
 * 菜单接口
 * @author kanglan
 * @date 2018/07/23
 */
public interface MenuService {

    /**
     * 保存菜单
     * @param sysMenuPo
     */
    void saveMenu (SysMenuPo sysMenuPo);

    /**
     * 删除菜单
     * @param menuCode
     */
    void deleteMenu (String menuCode);

    /**
     * 更新菜单
     * @param sysMenuPo
     */
    void updateMenuByMenuCode (SysMenuPo sysMenuPo);

    /**
     * 根据code获取菜单信息
     * @param menuCode
     * @return
     */
    SysMenuPo getMenuByCode (String menuCode);

    /**
     * 获取所有菜单数据
     * @return
     */
    List<SysMenuPo> getMenuList ();

    /**
     * 根据条件查询菜单列表
     * @param sysMenuPo
     * @return
     */
    List<SysMenuPo> getMenuListByParams (SysMenuPo sysMenuPo);

}
