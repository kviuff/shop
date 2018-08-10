package com.kviuff.shop.controller.role;

import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysRolePo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.utils.R;
import com.kviuff.shop.service.role.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 角色接口-restful
 *
 * @author kanglan
 * @date 2018/07/20
 */
@RestController
@RequestMapping("/rest/sys/role")
public class SysRoleRestController {

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 获取角色分页数据
     *
     * @return
     */
    @RequestMapping("/list")
    public R findAllMenu(HttpServletRequest request) {
        try {
            // 每页条数
            int pageSize = Integer.parseInt(request.getParameter("limit"));
            // 页码
            String pageNo = request.getParameter("page") == null ? "1" : request.getParameter("page");
            // 登录账号
            String roleCode = request.getParameter("roleCode");
            String roleName = request.getParameter("roleName");
            SysRolePo sysRolePo = new SysRolePo();
            sysRolePo.setRoleCode(roleCode);
            sysRolePo.setRoleName(roleName);
            PageInfo<SysRolePo> sysRolePoPageInfo = sysRoleService.findPageList(sysRolePo);
            Map<String, Object> map = new HashMap<>();
            map.put("count", sysRolePoPageInfo.getTotal());
            map.put("data", sysRolePoPageInfo.getList());
            return R.ok(map);
        } catch (Exception e) {
            e.getMessage();
            return R.error("获取角色列表出错");
        }
    }

    /**
     * 保存角色
     *
     * @param sysRolePo
     */
    @RequestMapping("/save")
    public R saveMenu(@RequestBody SysRolePo sysRolePo) {
        try {
            sysRolePo.setCreateBy("系统");
            sysRolePo.setCreateDate(new Date());
            sysRoleService.insertRole(sysRolePo);
            return R.ok("保存成功");
        } catch (Exception e) {
            e.getMessage();
            return R.error("新增角色出错");
        }
    }


    /**
     * 修改角色
     *
     * @param sysRolePo
     */
    @RequestMapping("/update")
    public R updateMenu(@RequestBody SysRolePo sysRolePo) {
        try {
            sysRoleService.updateRole(sysRolePo);
            return R.ok("修改成功");
        } catch (Exception e) {
            e.getMessage();
            return R.error("修改角色出错");
        }
    }

    /**
     * 删除角色
     *
     * @param roleCode
     */
    @RequestMapping("/delete/{roleCode}")
    public R deleteMenu(@PathVariable("roleCode") String roleCode) {
        try {
            sysRoleService.deleteRole(roleCode);
            return R.ok("删除成功");
        } catch (Exception e) {
            e.getMessage();
            return R.error("删除角色出错");
        }
    }


}
