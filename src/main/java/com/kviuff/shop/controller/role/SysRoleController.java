package com.kviuff.shop.controller.role;

import com.kviuff.shop.common.entity.SysRolePo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.service.role.SysRoleService;
import com.kviuff.shop.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 角色控制层
 * @author kanglan
 * @date 2018/08/09
 */
@Controller
@RequestMapping("/sys/role")
public class SysRoleController {

    final static String LIST_PAGE = "/modules/sys/role/list";
    final static String ADD_PAGE = "/modules/sys/role/add";
    final static String EDIT_PAGE = "/modules/sys/role/edit";

    @Autowired
    private SysRoleService sysRoleService;

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
     * @return
     */
    @RequestMapping("add")
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView(ADD_PAGE);
        return mv;
    }

    /**
     * 加载编辑页
     * @return
     */
    @RequestMapping("edit/{roleCode}")
    public ModelAndView edit(@PathVariable String roleCode) {
        ModelAndView mv = new ModelAndView(EDIT_PAGE);
        SysRolePo sysRolePo = sysRoleService.selectRole(roleCode);
        mv.addObject("sysRolePo", sysRolePo);
        return mv;
    }

}
