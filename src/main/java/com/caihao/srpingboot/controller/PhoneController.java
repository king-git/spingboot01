package com.caihao.srpingboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CaiHao
 * @create 2019-03-20 下午 19:10:55
 */

@RestController
public class PhoneController {

    @RequestMapping("/phone")
    public String tellPhone(){

        return "15062263170";

    }

}
