package com.lsr.study.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:   lushaorong
 * Date:     2019/1/25 15:12
 * Description:
 */
@RestController //已json格式返回
public class HelloWorldController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
