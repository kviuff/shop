package com.kviuff.shop.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kviuff.shop.common.entity.SysUserPo;
import com.kviuff.shop.common.utils.IdGen;
import com.kviuff.shop.common.utils.PageUtils;
import com.kviuff.shop.mapper.user.SysUserMapper;
import com.kviuff.shop.service.user.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户实现
 * @author kanglan
 * @Date   2018/06/01
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 保存用户信息
     * @param sysUserPo
     */
    @Override
    public void saveUser(SysUserPo sysUserPo) {
        sysUserPo.setUserCode(IdGen.uuid());
        sysUserPo.setCreateDate(new Date());
        sysUserPo.setCreateBy("系统");
        sysUserPo.setStatus("0");
        sysUserMapper.insert(sysUserPo);
    }

    /**
     * 删除用户信息
     * @param userCode
     */
    @Override
    public void deleteUser(String userCode) {
        sysUserMapper.deleteByPrimaryKey(userCode);
    }

    /**
     * 更新用户信息
     * @param sysUserPo
     */
    @Override
    public void updateUser(SysUserPo sysUserPo) {
        sysUserMapper.updateByPrimaryKeySelective(sysUserPo);
    }

    /**
     * 查询用户信息
     * @param userCode
     * @return
     */
    @Override
    public SysUserPo getUser(String userCode) {
        return sysUserMapper.selectByPrimaryKey(userCode);
    }

    /**
     * 分页查询
     * @param sysUserPo
     * @return
     */
    @Override
    public PageInfo<SysUserPo> findPageList(SysUserPo sysUserPo) {
        PageHelper.startPage(sysUserPo.getPageNo(), sysUserPo.getPageSize());
        List<SysUserPo> sysUserPoList = sysUserMapper.selectSysUserByCondition(sysUserPo);
        return PageUtils.pageInstance(sysUserPoList);
    }
}
