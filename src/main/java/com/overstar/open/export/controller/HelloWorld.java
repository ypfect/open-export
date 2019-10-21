package com.overstar.open.export.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/10/21 14:23
 */
@RestController
public class HelloWorld {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
