package com.xx.rose.jade.demo.service.impl;

import com.xx.rose.jade.demo.bean.User;
import com.xx.rose.jade.demo.dao.UserDAO;
import com.xx.rose.jade.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 11:55
 * @since
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDao;

    /**
     * 插入新用户
     *
     * @param account  账号
     * @param password 密码
     * @return 递增ID
     */
    @Override
    public int insertUser(int account, String password) {
        return userDao.insertUser(account, password);
    }

    /**
     * 根据id删除新用户
     *
     * @param id id
     * @return 结果
     */
    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    /**
     * 根据账号修改密码
     *
     * @param account  账号
     * @param password 密码
     * @return 结果
     */
    @Override
    public int updateUser(int account, String password) {
        return userDao.updateUser(account, password);
    }

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @Override
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }
}
