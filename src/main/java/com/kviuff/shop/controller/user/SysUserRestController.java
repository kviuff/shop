package com.kviuff.shop.controller.user;


import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.utils.R;
import com.kviuff.shop.service.user.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

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
    public R findAllMenu(HttpServletRequest request) {
        int pageSize = Integer.parseInt(request.getParameter("limit"));
        String pageNo = request.getParameter("page") == null ? "1" : request.getParameter("page");
        SysUserPo sysUserPo = new SysUserPo();
        sysUserPo.setPageNo(Integer.parseInt(pageNo));
        sysUserPo.setPageSize(pageSize);
        PageInfo<SysUserPo> sysUserPoPageInfo = sysUserService.findPageList(sysUserPo);
        Map<String, Object> map = new HashMap<>();
        map.put("count", sysUserPoPageInfo.getTotal());
        map.put("data", sysUserPoPageInfo.getList());
        return R.ok(map);
    }

    /**
     * 保存用户
     *
     * @param sysUserPo
     */
    @RequestMapping("/save")
    public R saveMenu(@RequestBody SysUserPo sysUserPo) {
        sysUserService.saveUser(sysUserPo);
        return R.ok("保存成功");
    }


    /**
     * 修改菜单
     *
     * @param sysUserPo
     */
    @RequestMapping("/update")
    public R updateMenu(@RequestBody SysUserPo sysUserPo) {
        sysUserService.updateUser(sysUserPo);
        return R.ok("修改成功");
    }

    /**
     * 删除菜单
     *
     * @param userCode
     */
    @RequestMapping("/delete/{userCode}")
    public R deleteMenu(@PathVariable("userCode") String userCode) {
        sysUserService.deleteUser(userCode);
        return R.ok("删除成功");
    }
}
