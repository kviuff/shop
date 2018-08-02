package com.kviuff.shop.service.menu.impl;

import com.kviuff.shop.common.utils.IdGen;
import com.kviuff.shop.common.entity.SysMenuPo;
import com.kviuff.shop.mapper.menu.MenuMapper;
import com.kviuff.shop.service.menu.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单实现类
 * @author kanglan
 * @date 2018/07/23
 */
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 保存菜单
     * @param sysMenuPo
     */
    @Override
    public void saveMenu(SysMenuPo sysMenuPo) {
        sysMenuPo.setMenuCode(IdGen.uuid());
        menuMapper.insert(sysMenuPo);
    }

    /**
     * 删除菜单
     * @param menuCode
     */
    @Override
    public void deleteMenu(String menuCode) {
        menuMapper.deleteByPrimaryKey(menuCode);
    }

    /**
     * 更新菜单
     * @param sysMenuPo
     */
    @Override
    public void updateMenuByMenuCode(SysMenuPo sysMenuPo) {
        menuMapper.updateByPrimaryKey(sysMenuPo);
    }

    /**
     * 根据code获取菜单信息
     * @param menuCode
     * @return
     */
    @Override
    public SysMenuPo getMenuByCode(String menuCode) {
        return menuMapper.selectByPrimaryKey(menuCode);
    }

    /**
     * 获取所有菜单数据
     * @return
     */
    @Override
    public List<SysMenuPo> getMenuList() {
        return menuMapper.selectAll();
    }

    /**
     * 根据条件查询菜单列表
     * @param sysMenuPo
     * @return
     */
    @Override
    public List<SysMenuPo> getMenuListByParams(SysMenuPo sysMenuPo) {
        return menuMapper.getMenuListByParams(sysMenuPo);
    }
}
