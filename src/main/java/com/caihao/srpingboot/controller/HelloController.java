package com.caihao.srpingboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaiHao
 * @create 2019-03-19 下午 20:14:36
 */

@RestController
public class HelloController {

    @RequestMapping(value = "/say")
    public String sayHello(){

        return "Hello 蔡浩";
    }
}
