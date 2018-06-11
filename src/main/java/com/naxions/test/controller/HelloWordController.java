package com.naxions.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tiancun
 * @date 2018-06-11
 */
@RestController
public class HelloWordController {

    @RequestMapping("/index")
    public String index(){

        return "HelloWord!!!!噢噢噢噢哈哈哈";
    }

}
