package com.kviuff.shop.controller.user;

import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制层
 * @author kanglan
 * @Date   2018/06/01
 */

@Controller
@RequestMapping("/sys/user")
public class SysUserController {

    final static String LIST_PAGE = "/modules/sys/user/list";
    final static String ADD_PAGE = "/modules/sys/user/add";
    final static String EDIT_PAGE = "/modules/sys/user/edit";

    @Autowired
    private SysUserService sysUserService;

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
    @RequestMapping("edit/{userCode}")
    public ModelAndView edit(@PathVariable String userCode) {
        ModelAndView mv = new ModelAndView(EDIT_PAGE);
        SysUserPo sysUserPo = sysUserService.getUser(userCode);
        mv.addObject("sysUserPo", sysUserPo);
        return mv;
    }
}
