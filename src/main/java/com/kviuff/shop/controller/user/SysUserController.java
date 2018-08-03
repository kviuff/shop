package com.kviuff.shop.controller.user;

import org.springframework.stereotype.Controller;
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

    final static String LIST_PAGE = "system/user/list";

    /**
     * 加载列表页
     * @return
     */
    @RequestMapping("list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView(LIST_PAGE);
        return mv;
    }
}
