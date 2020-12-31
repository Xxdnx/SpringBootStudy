package com.xx.rose.jade.demo.service;

import com.xx.rose.jade.demo.bean.User;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 11:51
 * @since
 */
public interface UserService {
    /**
     * 插入新用户
     *
     * @param account 账号
     * @param password 密码
     * @return 递增ID
     */
    int insertUser(int account, String password);

    /**
     * 根据id删除新用户
     *
     * @param id id
     * @return 结果
     */
    int deleteUser(int id);

    /**
     * 根据账号修改密码
     *
     * @param account 账号
     * @param password 密码
     * @return 结果
     */
    int updateUser(int account, String password);

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    User getUser(Integer id);
}
