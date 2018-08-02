package com.kviuff.shop.service.user;

import com.kviuff.shop.common.entity.UserPo;

/**
 * 用户接口
 * @author kanglan
 * @Date   2018/06/01
 */
public interface UserService {

    /**
     * 保存用户信息
     * @param userPo
     */
    void saveUser (UserPo userPo);

    /**
     * 删除用户信息
     * @param userId
     */
    void deleteUser (String userId);

    /**
     * 更新用户信息
     * @param userPo
     */
    void updateUser (UserPo userPo);

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserPo getUser (String userId);

    /**
     * 分页查询
     * @param userPo
     * @param pageable
     * @return
     */
    //PageInfo<UserPo> findPageList(UserPo userPo, Pageable pageable);
}
