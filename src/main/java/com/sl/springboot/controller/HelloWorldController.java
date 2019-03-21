package com.sl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * <p>springboot 测试demo
 *
 * @author kqyang
 * @version 1.0
 * @date 2019/3/21 15:39
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
