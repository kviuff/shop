package com.kviuff.shop.controller.menu;

import com.kviuff.shop.common.entity.SysMenuPo;
import com.kviuff.shop.service.menu.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 菜单控制层
 * @author kanglan
 * @date 2018/07/20
 */
@Controller
@RequestMapping("menu")
public class MenuController {

    final static String LIST_PAGE = "/modules/sys/menu/list";
    final static String ADD_PAGE = "/modules/sys/menu/add";
    final static String EDIT_PAGE = "/modules/sys/menu/edit";

    @Autowired
    private MenuService menuService;

    /**
     * 加载列表页
     * @return
     */
    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView(LIST_PAGE);
        return mv;
    }

    /**
     * 加载新增页
     * @param menuCode 父级ID
     * @return
     */
    @RequestMapping("add/{menuCode}")
    public ModelAndView add(@PathVariable String menuCode) {
        ModelAndView mv = new ModelAndView(ADD_PAGE);
        mv.addObject("menuCode", menuCode);
        return mv;
    }


    /**
     * 加载编辑页
     * @param menuCode 本身ID
     * @return
     */
    @RequestMapping("edit/{menuCode}")
    public ModelAndView edit(@PathVariable String menuCode) {
        SysMenuPo sysMenuPo = menuService.getMenuByCode(menuCode);
        ModelAndView mv = new ModelAndView(EDIT_PAGE);
        mv.addObject("sysMenuPo", sysMenuPo);
        return mv;
    }
}
