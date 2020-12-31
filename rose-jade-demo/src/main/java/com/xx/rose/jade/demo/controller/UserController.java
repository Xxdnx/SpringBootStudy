package com.xx.rose.jade.demo.controller;

import com.xx.rose.jade.demo.bean.User;
import com.xx.rose.jade.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Xx
 * @program study
 * @description
 * @create 2020-12-31 11:50
 * @since
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/insert")
    public String insertUser(@RequestParam("account") Integer account, @RequestParam("password") String password) {
        if (userService.insertUser(account, password) > 0) {
            return "success";
        }
        return "failure";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        if (userService.deleteUser(id) > 0) {
            return "success";
        }
        return "failure";
    }

    @GetMapping("/update")
    public String updateUser(@RequestParam("account") Integer account, @RequestParam("password") String password) {
        if (userService.updateUser(account, password) > 0) {
            return "success";
        }
        return "failure";
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id) {
        System.out.println(id);
        return userService.getUser(id);
    }
}
