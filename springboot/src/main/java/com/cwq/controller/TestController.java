package com.cwq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenqing.chen
 * @time 2021/01/14 12:48
 * @description
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
