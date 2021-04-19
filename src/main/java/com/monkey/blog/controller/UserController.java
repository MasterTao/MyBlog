package com.monkey.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tao
 * @date 2021/4/16 6:02 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
