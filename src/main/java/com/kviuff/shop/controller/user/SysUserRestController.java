package com.kviuff.shop.controller.user;


import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysMenuPo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.utils.R;
import com.kviuff.shop.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户接口-restful
 *
 * @author kanglan
 * @date 2018/08/02
 */
@RestController
@RequestMapping("/rest/sys/user")
public class SysUserRestController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 获取用户分页数据
     *
     * @return
     */
    @RequestMapping("/list")
    public R findAllMenu() {
        SysUserPo sysUserPo = new SysUserPo();
        PageInfo<SysUserPo> sysUserPoPageInfo = sysUserService.findPageList(sysUserPo);
        return R.ok().put("data", null);
    }
}
