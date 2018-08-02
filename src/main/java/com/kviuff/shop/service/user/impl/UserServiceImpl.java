package com.kviuff.shop.service.user.impl;

import com.kviuff.shop.common.entity.UserPo;
import com.kviuff.shop.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * 用户实现
 * @author kanglan
 * @Date   2018/06/01
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 保存用户信息
     * @param userPo
     */
    @Override
    public void saveUser(UserPo userPo) {
        mongoTemplate.save(userPo);
    }

    /**
     * 删除用户信息
     * @param userId
     */
    @Override
    public void deleteUser(String userId) {
        Query query = new Query(Criteria.where("id").is(userId));
        mongoTemplate.remove(query, UserPo.class);
    }

    /**
     * 更新用户信息
     * @param userPo
     */
    @Override
    public void updateUser(UserPo userPo) {
    }

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    @Override
    public UserPo getUser(String userId) {
        Query query = new Query(Criteria.where("id").is(userId));
        UserPo userPo = mongoTemplate.findOne(query, UserPo.class);
        return userPo;
    }

//    /**
//     * 分页查询
//     * @param userPo
//     * @param pageable
//     * @return
//     */
//    @Override
//    public PageInfo<UserPo> findPageList(UserPo userPo, Pageable pageable) {
//        Query query = new Query();
//        List<UserPo> userPoList = mongoTemplate.find(query.with(pageable), UserPo.class);
//        return new PageInfo<>(userPoList);
//    }
}
