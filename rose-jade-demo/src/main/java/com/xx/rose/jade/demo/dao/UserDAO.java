package com.xx.rose.jade.demo.dao;

import com.xx.rose.jade.demo.bean.User;
import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.ReturnGeneratedKeys;
import net.paoding.rose.jade.annotation.SQL;
import net.paoding.rose.jade.annotation.SQLParam;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 11:51
 * @since
 */
@DAO
public interface UserDAO {

    /**
     * 插入新用户
     *
     * @param account 账号
     * @param password 密码
     * @return 递增ID
     */
    @ReturnGeneratedKeys
    @SQL("INSERT INTO user(account, password) VALUES(:account, :password)")
    int insertUser(@SQLParam("account") Integer account, @SQLParam("password") String password);

    /**
     * 根据id删除新用户
     *
     * @param id id
     * @return 结果
     */
    @SQL("DELETE FROM user WHERE id = :id")
    int deleteUser(@SQLParam("id") Integer id);

    /**
     * 根据账号修改密码
     *
     * @param account 账号
     * @param password 密码
     * @return 结果
     */
    @SQL("UPDATE user SET password = :password WHERE account = :account")
    int updateUser(@SQLParam("account") Integer account, @SQLParam("password") String password);

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return 用户信息
     */
    @SQL("SELECT * FROM user WHERE id = :id")
    User getUser(@SQLParam("id") Integer id);
}
